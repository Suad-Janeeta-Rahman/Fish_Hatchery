package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class CheckStockController
{
    @javafx.fxml.FXML
    private Label checkStockLabel;
    @javafx.fxml.FXML
    private ComboBox<String> filterBySpeciesComboBox;
    @javafx.fxml.FXML
    private Label availableQuantityLabel;
    @javafx.fxml.FXML
    private ComboBox<String> filterBySizeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        filterBySpeciesComboBox.getItems().addAll("Rui", "Katla", "Hilsa", "Carp") ;
        filterBySizeComboBox.getItems().addAll("Large", "Medium", "Small") ;

    }

    @javafx.fxml.FXML
    public void viewStockRecordsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkStockButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearFilterButtonOA(ActionEvent actionEvent) {
        filterBySpeciesComboBox.setValue(null);
        filterBySizeComboBox.setValue(null);

        checkStockLabel.setText(null);
    }
}