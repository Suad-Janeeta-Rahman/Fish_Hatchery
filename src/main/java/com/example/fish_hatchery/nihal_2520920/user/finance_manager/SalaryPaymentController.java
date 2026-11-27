
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class SalaryPaymentController {

    @FXML
    private TextField paymentIdTextField;

    @FXML
    private TextField employeeNameTextField;

    @FXML
    private TextField salaryAmountTextField;

    @FXML
    private DatePicker paymentDatePicker;

    @FXML
    private ComboBox<String> paymentStatusComboBox;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<SalaryPayment> paymentTableView;

    @FXML
    private TableColumn<SalaryPayment, String> paymentIdColumn;

    @FXML
    private TableColumn<SalaryPayment, String> employeeNameColumn;

    @FXML
    private TableColumn<SalaryPayment, Double> salaryAmountColumn;

    @FXML
    private TableColumn<SalaryPayment, LocalDate> paymentDateColumn;

    @FXML
    private TableColumn<SalaryPayment, String> paymentStatusColumn;

    @FXML
    private TableColumn<SalaryPayment, String> descriptionColumn;


    private ObservableList<SalaryPayment> paymentList =
            FXCollections.observableArrayList();

    private ObservableList<SalaryPayment> searchList =
            FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        paymentStatusComboBox.setItems(
                FXCollections.observableArrayList(
                        "Paid",
                        "Pending",
                        "Unpaid"
                )
        );

        paymentIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("paymentId"));

        employeeNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("employeeName"));

        salaryAmountColumn.setCellValueFactory(
                new PropertyValueFactory<>("salaryAmount"));

        paymentDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("paymentDate"));

        paymentStatusColumn.setCellValueFactory(
                new PropertyValueFactory<>("paymentStatus"));

        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        paymentTableView.setItems(paymentList);
    }


    @FXML
    private void handleAddPayment(ActionEvent event) {

        try {

            String paymentId =
                    paymentIdTextField.getText().trim();

            String employeeName =
                    employeeNameTextField.getText().trim();

            String amountText =
                    salaryAmountTextField.getText().trim();

            String paymentStatus =
                    paymentStatusComboBox.getValue();

            String description =
                    descriptionTextArea.getText().trim();

            if (paymentId.isEmpty() || employeeName.isEmpty()
                    || amountText.isEmpty()
                    || paymentStatus == null
                    || paymentDatePicker.getValue() == null
                    || description.isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (SalaryPayment payment : paymentList) {

                if (payment.getPaymentId()
                        .equalsIgnoreCase(paymentId)) {

                    showAlert("Payment ID already exists.");
                    return;
                }
            }

            double salaryAmount = Double.parseDouble(amountText);

            if (salaryAmount <= 0) {

                showAlert("Salary amount must be greater than zero.");
                return;
            }

            SalaryPayment payment = new SalaryPayment(
                    paymentId,
                    employeeName,
                    salaryAmount,
                    paymentDatePicker.getValue(),
                    paymentStatus,
                    description
            );

            paymentList.add(payment);

            paymentTableView.setItems(paymentList);

            handleClear();

            showAlert("Salary payment record added successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter a valid salary amount.");
        }
    }


    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        searchList.clear();

        for (SalaryPayment payment : paymentList) {

            if (payment.getPaymentId().toLowerCase().contains(keyword)
                    || payment.getEmployeeName().toLowerCase()
                    .contains(keyword)
                    || payment.getPaymentStatus().toLowerCase()
                    .contains(keyword)) {

                searchList.add(payment);
            }
        }

        paymentTableView.setItems(searchList);
    }


    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();

        paymentTableView.setItems(paymentList);
    }


    @FXML
    private void handleClear() {

        paymentIdTextField.clear();

        employeeNameTextField.clear();

        salaryAmountTextField.clear();

        paymentDatePicker.setValue(null);

        paymentStatusComboBox.getSelectionModel()
                .clearSelection();

        descriptionTextArea.clear();

        paymentTableView.getSelectionModel()
                .clearSelection();
    }


    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(message);

        alert.showAndWait();
    }
}
