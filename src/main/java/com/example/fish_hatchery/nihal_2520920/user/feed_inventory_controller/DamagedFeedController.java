
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DamagedFeedController {

    @FXML
    private TextField recordIdTextField;

    @FXML
    private TextField feedNameTextField;

    @FXML
    private TextField quantityTextField;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private ComboBox<String> damageTypeComboBox;

    @FXML
    private TextField reasonTextField;

    @FXML
    private DatePicker reportDatePicker;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<DamagedFeed> damagedFeedTableView;

    @FXML
    private TableColumn<DamagedFeed, String> recordIdColumn;

    @FXML
    private TableColumn<DamagedFeed, String> feedNameColumn;

    @FXML
    private TableColumn<DamagedFeed, Double> quantityColumn;

    @FXML
    private TableColumn<DamagedFeed, String> unitColumn;

    @FXML
    private TableColumn<DamagedFeed, String> damageTypeColumn;

    @FXML
    private TableColumn<DamagedFeed, String> reasonColumn;

    @FXML
    private TableColumn<DamagedFeed, java.time.LocalDate> reportDateColumn;

    @FXML
    private TableColumn<DamagedFeed, String> remarksColumn;

    private final ObservableList<DamagedFeed> damagedFeedList =
            FXCollections.observableArrayList();

    private FilteredList<DamagedFeed> filteredList;

    @FXML
    public void initialize() {

        unitComboBox.setItems(FXCollections.observableArrayList(
                "KG", "Bag", "Gram"
        ));

        damageTypeComboBox.setItems(FXCollections.observableArrayList(
                "Damaged",
                "Expired"
        ));

        recordIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("recordId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        quantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        damageTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("damageType"));

        reasonColumn.setCellValueFactory(
                new PropertyValueFactory<>("reason"));

        reportDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportDate"));

        remarksColumn.setCellValueFactory(
                new PropertyValueFactory<>("remarks"));

        filteredList = new FilteredList<>(damagedFeedList, p -> true);
        damagedFeedTableView.setItems(filteredList);
    }

    @FXML
    private void handleAddRecord(ActionEvent event) {

        try {
            String id = recordIdTextField.getText().trim();
            String feedName = feedNameTextField.getText().trim();
            String unit = unitComboBox.getValue();
            String damageType = damageTypeComboBox.getValue();
            String reason = reasonTextField.getText().trim();
            String remarks = remarksTextArea.getText().trim();

            if (id.isEmpty() || feedName.isEmpty()
                    || quantityTextField.getText().trim().isEmpty()
                    || unit == null || damageType == null
                    || reason.isEmpty()
                    || reportDatePicker.getValue() == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (DamagedFeed item : damagedFeedList) {
                if (item.getRecordId().equalsIgnoreCase(id)) {
                    showAlert("Record ID already exists.");
                    return;
                }
            }

            double quantity = Double.parseDouble(
                    quantityTextField.getText().trim());

            if (quantity <= 0) {
                showAlert("Quantity must be greater than zero.");
                return;
            }

            DamagedFeed damagedFeed = new DamagedFeed(
                    id,
                    feedName,
                    quantity,
                    unit,
                    damageType,
                    reason,
                    reportDatePicker.getValue(),
                    remarks
            );

            damagedFeedList.add(damagedFeed);
            handleClear();

        } catch (NumberFormatException e) {
            showAlert("Enter a valid quantity.");
        }
    }

    @FXML
    private void handleClear() {

        recordIdTextField.clear();
        feedNameTextField.clear();
        quantityTextField.clear();
        unitComboBox.setValue(null);
        damageTypeComboBox.setValue(null);
        reasonTextField.clear();
        reportDatePicker.setValue(null);
        remarksTextArea.clear();

        damagedFeedTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(item ->
                item.getRecordId().toLowerCase().contains(keyword)
                        || item.getFeedName().toLowerCase().contains(keyword)
                        || item.getDamageType().toLowerCase().contains(keyword)
                        || item.getReason().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();
        filteredList.setPredicate(item -> true);
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
