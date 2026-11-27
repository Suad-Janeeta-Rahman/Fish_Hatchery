
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FeedSupplyRequestController {

    @FXML
    private TextField searchTextField;

    @FXML
    private ComboBox<String> filterStatusComboBox;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private TableView<FeedSupplyRequest> requestTableView;

    @FXML
    private TableColumn<FeedSupplyRequest, String> requestIdColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> feedNameColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> requesterNameColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, Double> requestedQuantityColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> unitColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, java.time.LocalDate> requestDateColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> priorityColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> statusColumn;

    @FXML
    private TableColumn<FeedSupplyRequest, String> remarksColumn;

    private final ObservableList<FeedSupplyRequest> requestList =
            FXCollections.observableArrayList();

    private FilteredList<FeedSupplyRequest> filteredList;

    @FXML
    public void initialize() {

        statusComboBox.setItems(FXCollections.observableArrayList(
                "Pending", "Approved", "Rejected"
        ));

        filterStatusComboBox.setItems(FXCollections.observableArrayList(
                "All", "Pending", "Approved", "Rejected"
        ));

        filterStatusComboBox.setValue("All");

        requestIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("requestId"));

        feedNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("feedName"));

        requesterNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("requesterName"));

        requestedQuantityColumn.setCellValueFactory(
                new PropertyValueFactory<>("requestedQuantity"));

        unitColumn.setCellValueFactory(
                new PropertyValueFactory<>("unit"));

        requestDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("requestDate"));

        priorityColumn.setCellValueFactory(
                new PropertyValueFactory<>("priority"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        remarksColumn.setCellValueFactory(
                new PropertyValueFactory<>("remarks"));

        filteredList = new FilteredList<>(requestList, p -> true);
        requestTableView.setItems(filteredList);

        requestTableView.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {

                    if (newValue != null) {
                        statusComboBox.setValue(newValue.getStatus());
                    }
                });
    }

    @FXML
    private void handleUpdateStatus(ActionEvent event) {

        FeedSupplyRequest selected =
                requestTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Please select a request from the table.");
            return;
        }

        String newStatus = statusComboBox.getValue();

        if (newStatus == null) {
            showAlert("Please select a status.");
            return;
        }

        selected.setStatus(newStatus);
        requestTableView.refresh();

        showAlert("Request status updated successfully.");
    }

    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(request ->
                request.getRequestId().toLowerCase().contains(keyword)
                        || request.getFeedName().toLowerCase().contains(keyword)
                        || request.getRequesterName().toLowerCase().contains(keyword)
                        || request.getStatus().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void handleFilter(ActionEvent event) {

        String selectedStatus = filterStatusComboBox.getValue();
        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        filteredList.setPredicate(request -> {

            boolean matchesSearch =
                    request.getRequestId().toLowerCase().contains(keyword)
                            || request.getFeedName().toLowerCase().contains(keyword)
                            || request.getRequesterName().toLowerCase().contains(keyword)
                            || request.getStatus().toLowerCase().contains(keyword);

            boolean matchesStatus =
                    selectedStatus == null
                            || selectedStatus.equals("All")
                            || request.getStatus().equalsIgnoreCase(selectedStatus);

            return matchesSearch && matchesStatus;
        });
    }

    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();
        filterStatusComboBox.setValue("All");
        statusComboBox.setValue(null);

        filteredList.setPredicate(request -> true);
        requestTableView.getSelectionModel().clearSelection();
    }

    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
