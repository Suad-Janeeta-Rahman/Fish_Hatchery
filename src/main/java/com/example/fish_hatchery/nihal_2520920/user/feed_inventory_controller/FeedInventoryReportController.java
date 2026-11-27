
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedInventoryReportController {

    @FXML
    private TextField reportIdTextField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TextField reportingPeriodTextField;

    @FXML
    private TextField totalFeedItemsTextField;

    @FXML
    private TextField totalQuantityTextField;

    @FXML
    private TextField lowStockItemsTextField;

    @FXML
    private DatePicker reportDatePicker;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<FeedInventoryReport> reportTableView;

    @FXML
    private TableColumn<FeedInventoryReport, String> reportIdColumn;

    @FXML
    private TableColumn<FeedInventoryReport, String> reportTypeColumn;

    @FXML
    private TableColumn<FeedInventoryReport, String> reportingPeriodColumn;

    @FXML
    private TableColumn<FeedInventoryReport, Integer> totalFeedItemsColumn;

    @FXML
    private TableColumn<FeedInventoryReport, Double> totalQuantityColumn;

    @FXML
    private TableColumn<FeedInventoryReport, Integer> lowStockItemsColumn;

    @FXML
    private TableColumn<FeedInventoryReport, java.time.LocalDate> reportDateColumn;

    @FXML
    private TableColumn<FeedInventoryReport, String> remarksColumn;

    private final ObservableList<FeedInventoryReport> reportList =
            FXCollections.observableArrayList();

    private FilteredList<FeedInventoryReport> filteredList;

    @FXML
    public void initialize() {

        reportTypeComboBox.setItems(FXCollections.observableArrayList(
                "Daily", "Weekly", "Monthly", "Yearly"
        ));

        reportIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportId"));

        reportTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportType"));

        reportingPeriodColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportingPeriod"));

        totalFeedItemsColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalFeedItems"));

        totalQuantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalQuantity"));

        lowStockItemsColumn.setCellValueFactory(
                new PropertyValueFactory<>("lowStockItems"));

        reportDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportDate"));

        remarksColumn.setCellValueFactory(
                new PropertyValueFactory<>("remarks"));

        filteredList = new FilteredList<>(reportList, p -> true);
        reportTableView.setItems(filteredList);
    }

    @FXML
    private void handleGenerateReport(ActionEvent event) {

        try {
            String id = reportIdTextField.getText().trim();
            String type = reportTypeComboBox.getValue();
            String period = reportingPeriodTextField.getText().trim();
            String remarks = remarksTextArea.getText().trim();

            if (id.isEmpty() || type == null || period.isEmpty()
                    || totalFeedItemsTextField.getText().trim().isEmpty()
                    || totalQuantityTextField.getText().trim().isEmpty()
                    || lowStockItemsTextField.getText().trim().isEmpty()
                    || reportDatePicker.getValue() == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (FeedInventoryReport report : reportList) {
                if (report.getReportId().equalsIgnoreCase(id)) {
                    showAlert("Report ID already exists.");
                    return;
                }
            }

            int totalItems = Integer.parseInt(
                    totalFeedItemsTextField.getText().trim());

            double totalQuantity = Double.parseDouble(
                    totalQuantityTextField.getText().trim());

            int lowStock = Integer.parseInt(
                    lowStockItemsTextField.getText().trim());

            if (totalItems < 0 || totalQuantity < 0 || lowStock < 0) {
                showAlert("Report values cannot be negative.");
                return;
            }

            if (lowStock > totalItems) {
                showAlert("Low stock items cannot exceed total feed items.");
                return;
            }

            FeedInventoryReport report = new FeedInventoryReport(
                    id,
                    type,
                    period,
                    totalItems,
                    totalQuantity,
                    lowStock,
                    reportDatePicker.getValue(),
                    remarks
            );

            reportList.add(report);
            handleClear();

            showAlert("Feed inventory report generated successfully.");

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values.");
        }
    }

    @FXML
    private void handleClear() {

        reportIdTextField.clear();
        reportTypeComboBox.setValue(null);
        reportingPeriodTextField.clear();
        totalFeedItemsTextField.clear();
        totalQuantityTextField.clear();
        lowStockItemsTextField.clear();
        reportDatePicker.setValue(null);
        remarksTextArea.clear();

        reportTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(report ->
                report.getReportId().toLowerCase().contains(keyword)
                        || report.getReportType().toLowerCase().contains(keyword)
                        || report.getReportingPeriod().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();
        filteredList.setPredicate(report -> true);
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
