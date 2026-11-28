package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StockRecordsController
{
    @javafx.fxml.FXML
    private TableColumn<CheckStock, Integer> availableQuantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CheckStock, String> speciesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CheckStock, String> lastUpdatedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CheckStock, String> sizeTableColumn;
    @javafx.fxml.FXML
    private TableView<CheckStock> tableViewId;
    @javafx.fxml.FXML
    private Label stockRecordsLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }}