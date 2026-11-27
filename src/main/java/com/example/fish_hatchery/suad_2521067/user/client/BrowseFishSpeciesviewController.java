package com.example.fish_hatchery.suad_2521067.user.client;

import javafx.scene.control.*;

public class BrowseFishSpeciesviewController
{
    @javafx.fxml.FXML
    private TextField availableSizetextField;
    @javafx.fxml.FXML
    private TextField speciesidtextField;
    @javafx.fxml.FXML
    private Label speciesNameLabel;
    @javafx.fxml.FXML
    private TableColumn<BrowseFishSpecies, String> speciesIdCol;
    @javafx.fxml.FXML
    private TableColumn<BrowseFishSpecies, String> availableSizeCol;
    @javafx.fxml.FXML
    private ComboBox<BrowseFishSpecies> speciesNameCombobox;
    @javafx.fxml.FXML
    private TableColumn<BrowseFishSpecies, Float> priceCol;
    @javafx.fxml.FXML
    private CheckBox isAvailableCheckBox;
    @javafx.fxml.FXML
    private Label speciesIdLabel;
    @javafx.fxml.FXML
    private Label availableSizeLabel;
    @javafx.fxml.FXML
    private TableColumn<BrowseFishSpecies, Boolean> isAvailablecol;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TableView<BrowseFishSpecies> tableview;
    @javafx.fxml.FXML
    private TableColumn<BrowseFishSpecies, String> speciesnameCol;
    @javafx.fxml.FXML
    private Label priceLabel;
    @javafx.fxml.FXML
    private Label browseFishLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardMouseClick(ActionEvent actionEvent) {
    }
}