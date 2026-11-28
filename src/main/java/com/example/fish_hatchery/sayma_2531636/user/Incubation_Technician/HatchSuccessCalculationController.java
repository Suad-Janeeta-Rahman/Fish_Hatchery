package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HatchSuccessCalculationController
{
    @javafx.fxml.FXML
    private Label hatchSuccessRatioLabel;
    @javafx.fxml.FXML
    private Label hatchSuccessRatioCalculationLabel;
    @javafx.fxml.FXML
    private Label hatchCountLabel;
    @javafx.fxml.FXML
    private Label hatchingResultLabel;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;
    @javafx.fxml.FXML
    private Label totalEggsLabel;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField hatchedCountTextField;

    @javafx.fxml.FXML
    public void initialize() {
        batchIdComboBox.getItems().addAll("BATCH-01", "BATCH-02", "BATCH-03", "BATCH-04");
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        batchIdComboBox.setValue(null);

        hatchedCountTextField.clear() ;

        hatchSuccessRatioCalculationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void calculateButtonOA(ActionEvent actionEvent) {
    }
}