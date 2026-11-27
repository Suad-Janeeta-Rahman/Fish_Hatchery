
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class FinancialTransactionController {

    @FXML
    private TextField transactionIdTextField;

    @FXML
    private ComboBox<String> transactionTypeComboBox;

    @FXML
    private TextField amountTextField;

    @FXML
    private DatePicker transactionDatePicker;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TableView<FinancialTransaction> transactionTableView;

    @FXML
    private TableColumn<FinancialTransaction, String> transactionIdColumn;

    @FXML
    private TableColumn<FinancialTransaction, String> transactionTypeColumn;

    @FXML
    private TableColumn<FinancialTransaction, Double> amountColumn;

    @FXML
    private TableColumn<FinancialTransaction, LocalDate> dateColumn;

    @FXML
    private TableColumn<FinancialTransaction, String> descriptionColumn;


    private ObservableList<FinancialTransaction> transactionList =
            FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        transactionTypeComboBox.setItems(
                FXCollections.observableArrayList(
                        "Income",
                        "Expense"
                )
        );

        transactionIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("transactionId"));

        transactionTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("transactionType"));

        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        transactionTableView.setItems(transactionList);
    }


    @FXML
    private void handleAddTransaction(ActionEvent event) {

        try {

            String transactionId =
                    transactionIdTextField.getText().trim();

            String transactionType =
                    transactionTypeComboBox.getValue();

            String amountText =
                    amountTextField.getText().trim();

            String description =
                    descriptionTextArea.getText().trim();

            if (transactionId.isEmpty() || transactionType == null
                    || amountText.isEmpty()
                    || transactionDatePicker.getValue() == null
                    || description.isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (FinancialTransaction transaction : transactionList) {

                if (transaction.getTransactionId()
                        .equalsIgnoreCase(transactionId)) {

                    showAlert("Transaction ID already exists.");
                    return;
                }
            }

            double amount = Double.parseDouble(amountText);

            if (amount <= 0) {

                showAlert("Amount must be greater than zero.");
                return;
            }

            FinancialTransaction transaction =
                    new FinancialTransaction(
                            transactionId,
                            transactionType,
                            amount,
                            transactionDatePicker.getValue(),
                            description
                    );

            transactionList.add(transaction);

            transactionTableView.setItems(transactionList);

            handleClear();

            showAlert("Financial transaction recorded successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter a valid amount.");
        }
    }


    @FXML
    private void handleClear() {

        transactionIdTextField.clear();

        transactionTypeComboBox.getSelectionModel()
                .clearSelection();

        amountTextField.clear();

        transactionDatePicker.setValue(null);

        descriptionTextArea.clear();

        transactionTableView.getSelectionModel()
                .clearSelection();
    }


    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(message);

        alert.showAndWait();
    }
}
