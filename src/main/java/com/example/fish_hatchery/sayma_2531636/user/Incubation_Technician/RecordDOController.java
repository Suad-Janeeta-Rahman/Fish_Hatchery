package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class RecordDOController
{
    @javafx.fxml.FXML
    private TableColumn<DOReading, String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField doVakueTextField;
    @javafx.fxml.FXML
    private DatePicker readingDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<DOReading, Double> doValueTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DOReading, String> jarIdTableColumn;
    @javafx.fxml.FXML
    private Label recordDissolvedOxygenLabel;
    @javafx.fxml.FXML
    private ComboBox<String> jarIdComboBox;
    @javafx.fxml.FXML
    private Label doStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<DOReading, LocalDate> readingdateTableColumn;
    @javafx.fxml.FXML
    private TableView<DOReading> tableViewId;

    @javafx.fxml.FXML
    public void initialize() {
        jarIdComboBox.getItems().addAll("JAR-01", "JAR-02", "JAR-03", "JAR-04") ;

        jarIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("jarId"));
        doValueTableColumn.setCellValueFactory(new PropertyValueFactory<>("doValue"));
        readingdateTableColumn.setCellValueFactory(new PropertyValueFactory<>("readingTime"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        doVakueTextField.clear() ;

        jarIdComboBox.setValue(null);

        readingDateDatePicker.setValue(null);

        recordDissolvedOxygenLabel.setText("");
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}