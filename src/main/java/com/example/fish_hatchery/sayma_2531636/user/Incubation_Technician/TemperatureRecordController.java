package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TemperatureRecordController
{
    @javafx.fxml.FXML
    private TableColumn<TemperatureRecord, String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField temperatureTextField;
    @javafx.fxml.FXML
    private Label temperatureReadingRecordsLabel;
    @javafx.fxml.FXML
    private TableColumn<TemperatureRecord, String> jarIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> jarIdComboBox;
    @javafx.fxml.FXML
    private TableView<TemperatureRecord> tableViewId;
    @javafx.fxml.FXML
    private Label recoordWaterTemperatureLabel;
    @javafx.fxml.FXML
    private TableColumn<TemperatureRecord, Double> temperatureTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> readingTimeComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<TemperatureRecord, String> readingTimeTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        jarIdComboBox.getItems().addAll("JAR-01", "JAR-02", "JAR-03", "JAR-04") ;
        readingTimeComboBox.getItems().addAll("06:00 AM", "08:00 AM", "10:00 AM", "12:00 AM", "02:00 PM", "04:00 PM", "06:00 PM", "08:00 PM");

        jarIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("jarId"));
        temperatureTableColumn.setCellValueFactory(new PropertyValueFactory<>("temperature"));
        readingTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("readingTime"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        temperatureTextField.clear() ;

        jarIdComboBox.setValue(null);
        readingTimeComboBox.setValue(null);

        recoordWaterTemperatureLabel.setText("");
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}