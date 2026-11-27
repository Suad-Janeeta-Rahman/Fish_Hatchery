
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ReceivedFeedSupplyController {

    @FXML private TextField supplyIdTextField;
    @FXML private TextField feedNameTextField;
    @FXML private TextField supplierNameTextField;
    @FXML private TextField quantityTextField;
    @FXML private ComboBox<String> unitComboBox;
    @FXML private TextField unitPriceTextField;
    @FXML private DatePicker receivedDatePicker;
    @FXML private DatePicker expiryDatePicker;
    @FXML private TextArea remarksTextArea;
    @FXML private TextField searchTextField;

    @FXML private TableView<ReceivedFeedSupply> supplyTableView;
    @FXML private TableColumn<ReceivedFeedSupply, String> supplyIdColumn;
    @FXML private TableColumn<ReceivedFeedSupply, String> feedNameColumn;
    @FXML private TableColumn<ReceivedFeedSupply, String> supplierNameColumn;
    @FXML private TableColumn<ReceivedFeedSupply, Double> quantityColumn;
    @FXML private TableColumn<ReceivedFeedSupply, String> unitColumn;
    @FXML private TableColumn<ReceivedFeedSupply, Double> unitPriceColumn;
    @FXML private TableColumn<ReceivedFeedSupply, Double> totalCostColumn;
    @FXML private TableColumn<ReceivedFeedSupply, LocalDate> receivedDateColumn;
    @FXML private TableColumn<ReceivedFeedSupply, LocalDate> expiryDateColumn;

    private final ObservableList<ReceivedFeedSupply> supplyList =
            FXCollections.observableArrayList();

    private FilteredList<ReceivedFeedSupply> filteredSupplies;

    @FXML
    public void initialize() {

        unitComboBox.setItems(FXCollections.observableArrayList(
                "KG", "Bag"
        ));

        supplyIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("supplyId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        supplierNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("supplierName"));

        quantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        unitPriceColumn.setCellValueFactory(
                new PropertyValueFactory<>("unitPrice"));

        totalCostColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalCost"));

        receivedDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("receivedDate"));

        expiryDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("expiryDate"));

        filteredSupplies = new FilteredList<>(supplyList, p -> true);
        supplyTableView.setItems(filteredSupplies);
    }

    @FXML
    private void handleAddSupply(ActionEvent event) {

        try {
            String id = supplyIdTextField.getText().trim();
            String feed = feedNameTextField.getText().trim();
            String supplier = supplierNameTextField.getText().trim();
            String unit = unitComboBox.getValue();

            if (id.isEmpty() || feed.isEmpty() || supplier.isEmpty()
                    || unit == null
                    || quantityTextField.getText().trim().isEmpty()
                    || unitPriceTextField.getText().trim().isEmpty()
                    || receivedDatePicker.getValue() == null
                    || expiryDatePicker.getValue() == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (ReceivedFeedSupply supply : supplyList) {
                if (supply.getSupplyId().equalsIgnoreCase(id)) {
                    showAlert("Supply ID already exists.");
                    return;
                }
            }

            double quantity = Double.parseDouble(
                    quantityTextField.getText().trim());

            double price = Double.parseDouble(
                    unitPriceTextField.getText().trim());

            LocalDate receivedDate = receivedDatePicker.getValue();
            LocalDate expiryDate = expiryDatePicker.getValue();

            if (quantity <= 0 || price < 0) {
                showAlert("Quantity must be positive and price cannot be negative.");
                return;
            }

            if (expiryDate.isBefore(receivedDate)) {
                showAlert("Expiry date cannot be before received date.");
                return;
            }

            ReceivedFeedSupply supply = new ReceivedFeedSupply(
                    id, feed, supplier, quantity, unit, price,
                    receivedDate, expiryDate,
                    remarksTextArea.getText().trim()
            );

            supplyList.add(supply);
            supplyTableView.refresh();
            handleClear();

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values for quantity and price.");
        }
    }

    @FXML
    private void handleClear() {

        supplyIdTextField.clear();
        feedNameTextField.clear();
        supplierNameTextField.clear();
        quantityTextField.clear();
        unitComboBox.setValue(null);
        unitPriceTextField.clear();
        receivedDatePicker.setValue(null);
        expiryDatePicker.setValue(null);
        remarksTextArea.clear();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredSupplies.setPredicate(supply ->
                keyword.isEmpty()
                        || supply.getSupplyId().toLowerCase().contains(keyword)
                        || supply.getFeedName().toLowerCase().contains(keyword)
                        || supply.getSupplierName().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();
        filteredSupplies.setPredicate(supply -> true);
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Feed Supply");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
