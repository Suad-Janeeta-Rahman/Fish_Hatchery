
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class OperationalExpenseController {

    @FXML
    private TextField expenseIdTextField;

    @FXML
    private ComboBox<String> expenseCategoryComboBox;

    @FXML
    private TextField amountTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<OperationalExpense> expenseTableView;

    @FXML
    private TableColumn<OperationalExpense, String> expenseIdColumn;

    @FXML
    private TableColumn<OperationalExpense, String> expenseCategoryColumn;

    @FXML
    private TableColumn<OperationalExpense, Double> amountColumn;

    @FXML
    private TableColumn<OperationalExpense, LocalDate> dateColumn;

    @FXML
    private TableColumn<OperationalExpense, String> descriptionColumn;


    private ObservableList<OperationalExpense> expenseList =
            FXCollections.observableArrayList();

    private ObservableList<OperationalExpense> searchList =
            FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        expenseCategoryComboBox.setItems(
                FXCollections.observableArrayList(
                        "Feed Purchase",
                        "Electricity",
                        "Water Supply",
                        "Equipment",
                        "Maintenance",
                        "Transportation",
                        "Other"
                )
        );

        expenseIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("expenseId"));

        expenseCategoryColumn.setCellValueFactory(
                new PropertyValueFactory<>("expenseCategory"));

        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        expenseTableView.setItems(expenseList);
    }


    @FXML
    private void handleAddExpense(ActionEvent event) {

        try {

            String expenseId = expenseIdTextField.getText().trim();

            String category = expenseCategoryComboBox.getValue();

            String amountText = amountTextField.getText().trim();

            String description = descriptionTextArea.getText().trim();

            if (expenseId.isEmpty() || category == null
                    || amountText.isEmpty()
                    || datePicker.getValue() == null
                    || description.isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (OperationalExpense expense : expenseList) {

                if (expense.getExpenseId().equalsIgnoreCase(expenseId)) {

                    showAlert("Expense ID already exists.");
                    return;
                }
            }

            double amount = Double.parseDouble(amountText);

            if (amount <= 0) {

                showAlert("Expense amount must be greater than zero.");
                return;
            }

            OperationalExpense expense = new OperationalExpense(
                    expenseId,
                    category,
                    amount,
                    datePicker.getValue(),
                    description
            );

            expenseList.add(expense);

            expenseTableView.setItems(expenseList);

            handleClear();

            showAlert("Operational expense recorded successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter a valid amount.");
        }
    }


    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        searchList.clear();

        for (OperationalExpense expense : expenseList) {

            if (expense.getExpenseId().toLowerCase().contains(keyword)
                    || expense.getExpenseCategory().toLowerCase()
                    .contains(keyword)
                    || expense.getDescription().toLowerCase()
                    .contains(keyword)) {

                searchList.add(expense);
            }
        }

        expenseTableView.setItems(searchList);
    }


    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();

        expenseTableView.setItems(expenseList);
    }


    @FXML
    private void handleClear() {

        expenseIdTextField.clear();

        expenseCategoryComboBox.getSelectionModel().clearSelection();

        amountTextField.clear();

        datePicker.setValue(null);

        descriptionTextArea.clear();

        expenseTableView.getSelectionModel().clearSelection();
    }


    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(message);

        alert.showAndWait();
    }
}
