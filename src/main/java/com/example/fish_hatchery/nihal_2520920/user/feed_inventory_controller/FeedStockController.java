
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedStockController {

    @FXML
    private TextField feedIdTextField;

    @FXML
    private TextField feedNameTextField;

    @FXML
    private TextField currentQuantityTextField;

    @FXML
    private TextField minimumStockTextField;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<FeedStock> feedStockTableView;

    @FXML
    private TableColumn<FeedStock, String> feedIdColumn;

    @FXML
    private TableColumn<FeedStock, String> feedNameColumn;

    @FXML
    private TableColumn<FeedStock, Double> currentQuantityColumn;

    @FXML
    private TableColumn<FeedStock, Double> minimumStockColumn;

    @FXML
    private TableColumn<FeedStock, String> unitColumn;

    @FXML
    private TableColumn<FeedStock, String> statusColumn;

    private final ObservableList<FeedStock> stockList =
            FXCollections.observableArrayList();

    private FilteredList<FeedStock> filteredList;

    @FXML
    public void initialize() {

        unitComboBox.setItems(FXCollections.observableArrayList(
                "KG", "Bag", "Gram"
        ));

        feedIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        currentQuantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("currentQuantity"));

        minimumStockColumn.setCellValueFactory(
                new PropertyValueFactory<>("minimumStock"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        filteredList = new FilteredList<>(stockList, p -> true);
        feedStockTableView.setItems(filteredList);
    }

    @FXML
    private void handleAddStock(ActionEvent event) {

        try {
            String id = feedIdTextField.getText().trim();
            String name = feedNameTextField.getText().trim();
            String unit = unitComboBox.getValue();

            if (id.isEmpty() || name.isEmpty() || unit == null ||
                    currentQuantityTextField.getText().trim().isEmpty() ||
                    minimumStockTextField.getText().trim().isEmpty()) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (FeedStock stock : stockList) {
                if (stock.getFeedId().equalsIgnoreCase(id)) {
                    showAlert("Feed ID already exists.");
                    return;
                }
            }

            double quantity =
                    Double.parseDouble(currentQuantityTextField.getText());

            double minimum =
                    Double.parseDouble(minimumStockTextField.getText());

            if (quantity < 0 || minimum < 0) {
                showAlert("Quantity cannot be negative.");
                return;
            }

            FeedStock stock = new FeedStock(
                    id, name, quantity, minimum, unit
            );

            stockList.add(stock);
            handleClear();

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values.");
        }
    }

    @FXML
    private void handleUpdateStock(ActionEvent event) {

        FeedStock selected =
                feedStockTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Please select a feed record from the table.");
            return;
        }

        try {
            double quantity =
                    Double.parseDouble(currentQuantityTextField.getText());

            double minimum =
                    Double.parseDouble(minimumStockTextField.getText());

            if (quantity < 0 || minimum < 0) {
                showAlert("Quantity cannot be negative.");
                return;
            }

            selected.setCurrentQuantity(quantity);
            selected.setMinimumStock(minimum);

            feedStockTableView.refresh();
            handleClear();

        } catch (NumberFormatException e) {
            showAlert("Enter valid numeric values.");
        }
    }

    @FXML
    private void handleClear() {
        feedIdTextField.clear();
        feedNameTextField.clear();
        currentQuantityTextField.clear();
        minimumStockTextField.clear();
        unitComboBox.setValue(null);
        feedStockTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(stock ->
                stock.getFeedId().toLowerCase().contains(keyword) ||
                        stock.getFeedName().toLowerCase().contains(keyword) ||
                        stock.getStatus().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {
        searchTextField.clear();
        filteredList.setPredicate(stock -> true);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
