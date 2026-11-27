
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HatcheryIncomeController {

    @FXML
    private TextField incomeIdTextField;

    @FXML
    private TextField incomeSourceTextField;

    @FXML
    private TextField amountTextField;

    @FXML
    private DatePicker incomeDatePicker;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TableView<HatcheryIncome> incomeTableView;

    @FXML
    private TableColumn<HatcheryIncome, String> incomeIdColumn;

    @FXML
    private TableColumn<HatcheryIncome, String> incomeSourceColumn;

    @FXML
    private TableColumn<HatcheryIncome, Double> amountColumn;

    @FXML
    private TableColumn<HatcheryIncome, java.time.LocalDate> dateColumn;

    @FXML
    private TableColumn<HatcheryIncome, String> descriptionColumn;

    private final ObservableList<HatcheryIncome> incomeList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        incomeIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("incomeId"));

        incomeSourceColumn.setCellValueFactory(
                new PropertyValueFactory<>("incomeSource"));

        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        incomeTableView.setItems(incomeList);
    }

    @FXML
    private void handleAddIncome(ActionEvent event) {

        try {
            String incomeId = incomeIdTextField.getText().trim();
            String incomeSource = incomeSourceTextField.getText().trim();
            String amountText = amountTextField.getText().trim();
            String description = descriptionTextArea.getText().trim();

            if (incomeId.isEmpty() || incomeSource.isEmpty()
                    || amountText.isEmpty()
                    || incomeDatePicker.getValue() == null
                    || description.isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (HatcheryIncome income : incomeList) {
                if (income.getIncomeId().equalsIgnoreCase(incomeId)) {
                    showAlert("Income ID already exists.");
                    return;
                }
            }

            double amount = Double.parseDouble(amountText);

            if (amount <= 0) {
                showAlert("Income amount must be greater than zero.");
                return;
            }

            HatcheryIncome income = new HatcheryIncome(
                    incomeId,
                    incomeSource,
                    amount,
                    incomeDatePicker.getValue(),
                    description
            );

            incomeList.add(income);

            incomeTableView.refresh();
            handleClear();

            showAlert("Hatchery income recorded successfully.");

        } catch (NumberFormatException e) {
            showAlert("Please enter a valid amount.");
        }
    }

    @FXML
    private void handleClear() {

        incomeIdTextField.clear();
        incomeSourceTextField.clear();
        amountTextField.clear();
        incomeDatePicker.setValue(null);
        descriptionTextArea.clear();

        incomeTableView.getSelectionModel().clearSelection();
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
