
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialStatusController {

    @FXML
    private TextField statusIdTextField;

    @FXML
    private TextField totalIncomeTextField;

    @FXML
    private TextField totalExpensesTextField;

    @FXML
    private TextField totalSalaryTextField;

    @FXML
    private TextField netBalanceTextField;

    @FXML
    private ComboBox<String> financialPeriodComboBox;

    @FXML
    private DatePicker reportDatePicker;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<FinancialStatus> financialStatusTableView;

    @FXML
    private TableColumn<FinancialStatus, String> statusIdColumn;

    @FXML
    private TableColumn<FinancialStatus, String> financialPeriodColumn;

    @FXML
    private TableColumn<FinancialStatus, Double> totalIncomeColumn;

    @FXML
    private TableColumn<FinancialStatus, Double> totalExpensesColumn;

    @FXML
    private TableColumn<FinancialStatus, Double> totalSalaryColumn;

    @FXML
    private TableColumn<FinancialStatus, Double> netBalanceColumn;

    @FXML
    private TableColumn<FinancialStatus, java.time.LocalDate> reportDateColumn;

    private final ObservableList<FinancialStatus> statusList =
            FXCollections.observableArrayList();

    private FilteredList<FinancialStatus> filteredList;

    @FXML
    public void initialize() {

        financialPeriodComboBox.setItems(
                FXCollections.observableArrayList(
                        "Daily",
                        "Weekly",
                        "Monthly",
                        "Yearly"
                )
        );

        statusIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("statusId"));

        financialPeriodColumn.setCellValueFactory(
                new PropertyValueFactory<>("financialPeriod"));

        totalIncomeColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalIncome"));

        totalExpensesColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalExpenses"));

        totalSalaryColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalSalary"));

        netBalanceColumn.setCellValueFactory(
                new PropertyValueFactory<>("netBalance"));

        reportDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportDate"));

        filteredList = new FilteredList<>(statusList, p -> true);

        financialStatusTableView.setItems(filteredList);
    }

    @FXML
    private void handleCalculateStatus(ActionEvent event) {

        try {

            if (totalIncomeTextField.getText().trim().isEmpty()
                    || totalExpensesTextField.getText().trim().isEmpty()
                    || totalSalaryTextField.getText().trim().isEmpty()) {

                showAlert("Please enter all financial amounts.");
                return;
            }

            double income = Double.parseDouble(
                    totalIncomeTextField.getText().trim());

            double expenses = Double.parseDouble(
                    totalExpensesTextField.getText().trim());

            double salary = Double.parseDouble(
                    totalSalaryTextField.getText().trim());

            if (income < 0 || expenses < 0 || salary < 0) {
                showAlert("Financial amounts cannot be negative.");
                return;
            }

            double netBalance = income - (expenses + salary);

            netBalanceTextField.setText(String.valueOf(netBalance));

        } catch (NumberFormatException e) {

            showAlert("Please enter valid numeric amounts.");
        }
    }

    @FXML
    private void handleAddStatus(ActionEvent event) {

        try {

            String statusId = statusIdTextField.getText().trim();
            String period = financialPeriodComboBox.getValue();

            if (statusId.isEmpty() || period == null
                    || totalIncomeTextField.getText().trim().isEmpty()
                    || totalExpensesTextField.getText().trim().isEmpty()
                    || totalSalaryTextField.getText().trim().isEmpty()
                    || reportDatePicker.getValue() == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (FinancialStatus status : statusList) {

                if (status.getStatusId().equalsIgnoreCase(statusId)) {
                    showAlert("Status ID already exists.");
                    return;
                }
            }

            double income = Double.parseDouble(
                    totalIncomeTextField.getText().trim());

            double expenses = Double.parseDouble(
                    totalExpensesTextField.getText().trim());

            double salary = Double.parseDouble(
                    totalSalaryTextField.getText().trim());

            if (income < 0 || expenses < 0 || salary < 0) {
                showAlert("Financial amounts cannot be negative.");
                return;
            }

            FinancialStatus status = new FinancialStatus(
                    statusId,
                    period,
                    income,
                    expenses,
                    salary,
                    reportDatePicker.getValue(),
                    remarksTextArea.getText().trim()
            );

            statusList.add(status);

            financialStatusTableView.refresh();

            handleClear();

            showAlert("Financial status added successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter valid numeric amounts.");
        }
    }

    @FXML
    private void handleClear() {

        statusIdTextField.clear();
        financialPeriodComboBox.getSelectionModel().clearSelection();
        totalIncomeTextField.clear();
        totalExpensesTextField.clear();
        totalSalaryTextField.clear();
        netBalanceTextField.clear();
        reportDatePicker.setValue(null);
        remarksTextArea.clear();

        financialStatusTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(status ->

                keyword.isEmpty()
                        || status.getStatusId().toLowerCase().contains(keyword)
                        || status.getFinancialPeriod().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();

        filteredList.setPredicate(status -> true);
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
