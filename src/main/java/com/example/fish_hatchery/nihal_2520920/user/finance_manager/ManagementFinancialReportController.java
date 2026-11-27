
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ManagementFinancialReportController {

    @FXML
    private TextField reportIdTextField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TextField reportingPeriodTextField;

    @FXML
    private TextField totalIncomeTextField;

    @FXML
    private TextField totalExpensesTextField;

    @FXML
    private TextField totalSalaryTextField;

    @FXML
    private DatePicker reportDatePicker;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<ManagementFinancialReport> reportTableView;

    @FXML
    private TableColumn<ManagementFinancialReport, String> reportIdColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, String> reportTypeColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, String> reportingPeriodColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, Double> totalIncomeColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, Double> totalExpensesColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, Double> totalSalaryColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, LocalDate> reportDateColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, Double> netBalanceColumn;

    @FXML
    private TableColumn<ManagementFinancialReport, String> remarksColumn;


    private ObservableList<ManagementFinancialReport> reportList =
            FXCollections.observableArrayList();

    private ObservableList<ManagementFinancialReport> searchList =
            FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        reportTypeComboBox.setItems(
                FXCollections.observableArrayList(
                        "Daily", "Weekly", "Monthly", "Yearly"
                )
        );

        reportIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportId"));

        reportTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportType"));

        reportingPeriodColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportingPeriod"));

        totalIncomeColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalIncome"));

        totalExpensesColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalExpenses"));

        totalSalaryColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalSalary"));

        reportDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportDate"));

        netBalanceColumn.setCellValueFactory(
                new PropertyValueFactory<>("netBalance"));

        remarksColumn.setCellValueFactory(
                new PropertyValueFactory<>("remarks"));

        reportTableView.setItems(reportList);
    }


    @FXML
    private void handleAddReport(ActionEvent event) {

        try {

            String reportId = reportIdTextField.getText().trim();
            String reportType = reportTypeComboBox.getValue();
            String reportingPeriod = reportingPeriodTextField.getText().trim();

            String incomeText = totalIncomeTextField.getText().trim();
            String expensesText = totalExpensesTextField.getText().trim();
            String salaryText = totalSalaryTextField.getText().trim();

            LocalDate reportDate = reportDatePicker.getValue();
            String remarks = remarksTextArea.getText().trim();

            if (reportId.isEmpty() || reportType == null
                    || reportingPeriod.isEmpty()
                    || incomeText.isEmpty()
                    || expensesText.isEmpty()
                    || salaryText.isEmpty()
                    || reportDate == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (ManagementFinancialReport report : reportList) {

                if (report.getReportId().equalsIgnoreCase(reportId)) {

                    showAlert("Report ID already exists.");
                    return;
                }
            }

            double totalIncome = Double.parseDouble(incomeText);
            double totalExpenses = Double.parseDouble(expensesText);
            double totalSalary = Double.parseDouble(salaryText);

            if (totalIncome < 0 || totalExpenses < 0 || totalSalary < 0) {

                showAlert("Financial amounts cannot be negative.");
                return;
            }

            ManagementFinancialReport report =
                    new ManagementFinancialReport(
                            reportId,
                            reportType,
                            reportingPeriod,
                            totalIncome,
                            totalExpenses,
                            totalSalary,
                            reportDate,
                            remarks
                    );

            reportList.add(report);

            reportTableView.setItems(reportList);

            handleClear();

            showAlert("Financial report added successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter valid financial amounts.");
        }
    }


    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        searchList.clear();

        for (ManagementFinancialReport report : reportList) {

            if (report.getReportId().toLowerCase().contains(keyword)
                    || report.getReportType().toLowerCase().contains(keyword)
                    || report.getReportingPeriod().toLowerCase().contains(keyword)) {

                searchList.add(report);
            }
        }

        reportTableView.setItems(searchList);
    }


    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();

        reportTableView.setItems(reportList);
    }


    @FXML
    private void handleClear() {

        reportIdTextField.clear();
        reportTypeComboBox.getSelectionModel().clearSelection();
        reportingPeriodTextField.clear();
        totalIncomeTextField.clear();
        totalExpensesTextField.clear();
        totalSalaryTextField.clear();
        reportDatePicker.setValue(null);
        remarksTextArea.clear();

        reportTableView.getSelectionModel().clearSelection();
    }


    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(message);

        alert.showAndWait();
    }
}
