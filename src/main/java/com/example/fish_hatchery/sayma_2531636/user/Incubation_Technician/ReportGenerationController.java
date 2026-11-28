package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class ReportGenerationController
{
    @javafx.fxml.FXML
    private Label batchRegistrationLabel;
    @javafx.fxml.FXML
    private Label larvaeTransferLabel;
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private Label incubationPerformanceReportLabel;
    @javafx.fxml.FXML
    private Label totalMortalityLabel;
    @javafx.fxml.FXML
    private Label averageTemperatureLabel;
    @javafx.fxml.FXML
    private Label averageOxygenLevelLabel;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private Label hatchSuccessRationLabel;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label incubationPerformanceSummaryLabel;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Daily", "Weekly") ;
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        reportTypeComboBox.setValue(null);

        startDateDatePicker.setValue(null);
        endDateDatePicker.setValue(null);

        messageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void generateReportButtonOA(ActionEvent actionEvent) {
    }
}