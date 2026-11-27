
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedDistributionController {

    @FXML
    private TextField distributionIdTextField;

    @FXML
    private TextField feedNameTextField;

    @FXML
    private TextField recipientNameTextField;

    @FXML
    private TextField quantityTextField;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private DatePicker distributionDatePicker;

    @FXML
    private ComboBox<String> purposeComboBox;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<FeedDistribution> distributionTableView;

    @FXML
    private TableColumn<FeedDistribution, String> distributionIdColumn;

    @FXML
    private TableColumn<FeedDistribution, String> feedNameColumn;

    @FXML
    private TableColumn<FeedDistribution, String> recipientNameColumn;

    @FXML
    private TableColumn<FeedDistribution, Double> quantityColumn;

    @FXML
    private TableColumn<FeedDistribution, String> unitColumn;

    @FXML
    private TableColumn<FeedDistribution, java.time.LocalDate> distributionDateColumn;

    @FXML
    private TableColumn<FeedDistribution, String> purposeColumn;

    @FXML
    private TableColumn<FeedDistribution, String> remarksColumn;

    private final ObservableList<FeedDistribution> distributionList =
            FXCollections.observableArrayList();

    private FilteredList<FeedDistribution> filteredList;

    @FXML
    public void initialize() {

        unitComboBox.setItems(FXCollections.observableArrayList(
                "KG", "Bag", "Gram"
        ));

        purposeComboBox.setItems(FXCollections.observableArrayList(
                "Regular Feeding",
                "Fry Feeding",
                "Fingerling Feeding",
                "Broodstock Feeding",
                "Other"
        ));

        distributionIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("distributionId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        recipientNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("recipientName"));

        quantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        distributionDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("distributionDate"));

        purposeColumn.setCellValueFactory(
                new PropertyValueFactory<>("purpose"));

        remarksColumn.setCellValueFactory(
                new PropertyValueFactory<>("remarks"));

        filteredList = new FilteredList<>(distributionList, p -> true);
        distributionTableView.setItems(filteredList);
    }

    @FXML
    private void handleAddDistribution(ActionEvent event) {

        try {
            String id = distributionIdTextField.getText().trim();
            String feed = feedNameTextField.getText().trim();
            String recipient = recipientNameTextField.getText().trim();
            String unit = unitComboBox.getValue();
            String purpose = purposeComboBox.getValue();
            String remarks = remarksTextArea.getText().trim();

            if (id.isEmpty() || feed.isEmpty() || recipient.isEmpty()
                    || quantityTextField.getText().trim().isEmpty()
                    || unit == null || purpose == null
                    || distributionDatePicker.getValue() == null) {

                showAlert("Please fill in all required fields.");
                return;
            }

            for (FeedDistribution item : distributionList) {
                if (item.getDistributionId().equalsIgnoreCase(id)) {
                    showAlert("Distribution ID already exists.");
                    return;
                }
            }

            double quantity = Double.parseDouble(
                    quantityTextField.getText().trim());

            if (quantity <= 0) {
                showAlert("Quantity must be greater than zero.");
                return;
            }

            FeedDistribution distribution = new FeedDistribution(
                    id,
                    feed,
                    recipient,
                    quantity,
                    unit,
                    distributionDatePicker.getValue(),
                    purpose,
                    remarks
            );

            distributionList.add(distribution);
            handleClear();

        } catch (NumberFormatException e) {
            showAlert("Enter a valid quantity.");
        }
    }

    @FXML
    private void handleClear() {

        distributionIdTextField.clear();
        feedNameTextField.clear();
        recipientNameTextField.clear();
        quantityTextField.clear();
        unitComboBox.setValue(null);
        distributionDatePicker.setValue(null);
        purposeComboBox.setValue(null);
        remarksTextArea.clear();

        distributionTableView.getSelectionModel().clearSelection();
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(item ->
                item.getDistributionId().toLowerCase().contains(keyword)
                        || item.getFeedName().toLowerCase().contains(keyword)
                        || item.getRecipientName().toLowerCase().contains(keyword)
                        || item.getPurpose().toLowerCase().contains(keyword)
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
