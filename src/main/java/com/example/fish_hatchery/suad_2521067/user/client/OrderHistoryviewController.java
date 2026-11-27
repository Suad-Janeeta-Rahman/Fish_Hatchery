package com.example.fish_hatchery.suad_2521067.user.client;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class OrderHistoryviewController
{
    @javafx.fxml.FXML
    private TableColumn<OrderHistory, String> speciesNameCol;
    @javafx.fxml.FXML
    private TableColumn<OrderHistory, Float> amountCol;
    @javafx.fxml.FXML
    private TableColumn<OrderHistory, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<OrderHistory, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableView<OrderHistory> tableView;
    @javafx.fxml.FXML
    private ComboBox<OrderHistory> speciesNameComboBox;
    @javafx.fxml.FXML
    private Label orderHistoryFilter;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearMiuseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardMouseClick(ActionEvent actionEvent) {
    }
}