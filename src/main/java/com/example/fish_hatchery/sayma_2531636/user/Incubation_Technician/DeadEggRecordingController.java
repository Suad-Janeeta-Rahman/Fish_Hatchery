package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeadEggRecordingController
{
    @javafx.fxml.FXML
    private Label mortalityRateLabel;
    @javafx.fxml.FXML
    private Label liveEggCountLabel;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;
    @javafx.fxml.FXML
    private Label deadEggMortalityRecordingLabel;
    @javafx.fxml.FXML
    private TextField deadEggCountTextField;
    @javafx.fxml.FXML
    private DatePicker recordDateDatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        batchIdComboBox.getItems().addAll("BATCH-01", "BATCH-02", "BATCH-03", "BATCH-04") ;
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        batchIdComboBox.setValue(null);

        deadEggCountTextField.clear() ;

        recordDateDatePicker.setValue(null);

        deadEggMortalityRecordingLabel.setText("");
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}