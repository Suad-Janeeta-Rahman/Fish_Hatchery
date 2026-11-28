package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JarAssignmentController
{
    @javafx.fxml.FXML
    private TextField eggCountingTextField;
    @javafx.fxml.FXML
    private Label jarAssignmentLabel;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> jarIdComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        batchIdComboBox.getItems().addAll("BATCH-01", "BATCG-02", "BATCH-03", "BATCH_04") ;
        jarIdComboBox.getItems().addAll("JAR-01", "JAR-02", "JAR-03", "JAR-04") ;
    }

    @Deprecated
    public void assignOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewAssignmentRecordOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        batchIdComboBox.setValue(null);
        jarIdComboBox.setValue(null);

        eggCountingTextField.clear() ;

        jarAssignmentLabel.setText("");
    }

    @javafx.fxml.FXML
    public void assignButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewAssignmentRecordsButtonOA(ActionEvent actionEvent) {
    }
}