package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedAvailabilityController {

    @FXML
    private TextField feedIdTextField;
    @FXML
    private TextField feedNameTextField;
    @FXML
    private TextField availableQuantityTextField;
    @FXML
    private TextField minimumStockTextField;
    @FXML
    private ComboBox<String> unitComboBox;
    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<FeedAvailability> availabilityTableView;

    @FXML
    private TableColumn<FeedAvailability, String> feedIdColumn;
    @FXML
    private TableColumn<FeedAvailability, String> feedNameColumn;
    @FXML
    private TableColumn<FeedAvailability, Double> availableQuantityColumn;
    @FXML
    private TableColumn<FeedAvailability, Double> minimumStockColumn;
    @FXML
    private TableColumn<FeedAvailability, String> unitColumn;
    @FXML
    private TableColumn<FeedAvailability, String> availabilityStatusColumn;

    private final ObservableList<FeedAvailability> availabilityList =
            FXCollections.observableArrayList();

    private FilteredList<FeedAvailability> filteredList;

    @FXML
    public void initialize() {

        unitComboBox.setItems(FXCollections.observableArrayList(
                "KG", "Bag", "Gram"
        ));

        feedIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        availableQuantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("availableQuantity"));

        minimumStockColumn.setCellValueFactory(
                new PropertyValueFactory<>("minimumStock"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        availabilityStatusColumn.setCellValueFactory(
                new PropertyValueFactory<>("availabilityStatus"));

        filteredList = new FilteredList<>(availabilityList, p -> true);
        availabilityTableView.setItems(filteredList);
    }

    @FXML
    private void handleAddFeed(ActionEvent event) {

        try {
            String feedId = feedIdTextField.getText().trim();
            String feedName = feedNameTextField.getText().trim();
            String unit = unitComboBox.getValue();

            if (feedId.isEmpty() || feedName.isEmpty() || unit == null
                    || availableQuantityTextField.getText().trim().isEmpty()
                    || minimumStockTextField.getText().trim().isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (FeedAvailability feed : availabilityList) {
                if (feed.getFeedId().equalsIgnoreCase(feedId)) {
                    showAlert("Feed ID already exists.");
                    return;
                }
            }

            double quantity = Double.parseDouble(
                    availableQuantityTextField.getText().trim());

            double minimumStock = Double.parseDouble(
                    minimumStockTextField.getText().trim());

            if (quantity < 0 || minimumStock < 0) {
                showAlert("Quantity cannot be negative.");
                return;
            }

            FeedAvailability feed = new FeedAvailability(
                    feedId, feedName, quantity, minimumStock, unit
            );

            availabilityList.add(feed);
            availabilityTableView.refresh();
            handleClear();

            showAlert("Feed availability added successfully.");

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values for quantities.");
        }
    }

    @FXML
    private void handleUpdateAvailability(ActionEvent event) {

        FeedAvailability selectedFeed =
                availabilityTableView.getSelectionModel().getSelectedItem();

        if (selectedFeed == null) {
            showAlert("Please select a feed from the table.");
            return;
        }

        try {
            if (availableQuantityTextField.getText().trim().isEmpty()
                    || minimumStockTextField.getText().trim().isEmpty()) {

                showAlert("Enter available quantity and minimum stock.");
                return;
            }

            double quantity = Double.parseDouble(
                    availableQuantityTextField.getText().trim());

            double minimumStock = Double.parseDouble(
                    minimumStockTextField.getText().trim());

            if (quantity < 0 || minimumStock < 0) {
                showAlert("Quantity cannot be negative.");
                return;
            }

            selectedFeed.setAvailableQuantity(quantity);
            selectedFeed.setMinimumStock(minimumStock);

            if (unitComboBox.getValue() != null) {
                selectedFeed.setUnit(unitComboBox.getValue());
            }

            availabilityTableView.refresh();
            handleClear();

            showAlert("Feed availability updated successfully.");

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values.");
        }
    }

    @FXML
    private void handleClear() {
        feedIdTextField.clear();
        feedNameTextField.clear();
        availableQuantityTextField.clear();
        minimumStockTextField.clear();
        unitComboBox.getSelectionModel().clearSelection();
        availabilityTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(feed ->
                keyword.isEmpty()
                        || feed.getFeedId().toLowerCase().contains(keyword)
                        || feed.getFeedName().toLowerCase().contains(keyword)
                        || feed.getAvailabilityStatus().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {
        searchTextField.clear();
        filteredList.setPredicate(feed -> true);
    }

    @FXML
    private void handleTableSelection() {

        FeedAvailability selectedFeed =
                availabilityTableView.getSelectionModel().getSelectedItem();

        if (selectedFeed != null) {
            feedIdTextField.setText(selectedFeed.getFeedId());
            feedNameTextField.setText(selectedFeed.getFeedName());
            availableQuantityTextField.setText(
                    String.valueOf(selectedFeed.getAvailableQuantity()));
            minimumStockTextField.setText(
                    String.valueOf(selectedFeed.getMinimumStock()));
            unitComboBox.setValue(selectedFeed.getUnit());
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}