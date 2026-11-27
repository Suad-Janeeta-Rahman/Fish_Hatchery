package com.example.fish_hatchery.suad_2521067.user.client;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OrderHistoryviewController
{
    @javafx.fxml.FXML
    private TableColumn speciesNameCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private ComboBox speciesNameComboBox;
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