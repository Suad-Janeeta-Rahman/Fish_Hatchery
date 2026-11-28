package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class EggBatchRegistrationController
{
    @javafx.fxml.FXML
    private DatePicker collectionDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EggBatch, String> batchIdTableColumn;
    @javafx.fxml.FXML
    private TextField batchIdTextField;
    @javafx.fxml.FXML
    private TextField eggQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn<EggBatch, Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EggBatch, String> eggTypeTableColumn;
    @javafx.fxml.FXML
    private TableView<EggBatch> tableViewId;
    @javafx.fxml.FXML
    private DatePicker registrationDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> eggTypeComboBox;
    @javafx.fxml.FXML
    private Label eggBatchRegistrationLabel;
    @javafx.fxml.FXML
    private TableColumn<EggBatch, LocalDate> collectionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EggBatch, LocalDate> registrationDateTableColumn;
    @javafx.fxml.FXML
    private Label messageLabel;

    private ArrayList<EggBatch> eggBatchList = new ArrayList<>() ;

    @javafx.fxml.FXML
    public void initialize() {
        collectionDateDatePicker.setValue(LocalDate.now());
        registrationDateDatePicker.setValue(LocalDate.now());

        eggTypeComboBox.getItems().addAll("Rui", "Katla", "Hilsa", "Carp") ;

        batchIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("eggQuantity"));
        eggTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("eggType"));
        collectionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("collectionDate"));
        registrationDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("registrationDate"));
    }

    @javafx.fxml.FXML
    public void ClearButtonOA(ActionEvent actionEvent) {
        batchIdTextField.clear() ;
        eggQuantityTextField.clear();

        eggTypeComboBox.setValue(null);

        collectionDateDatePicker.setValue(null);
        registrationDateDatePicker.setValue(null);

        messageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void RegisterButtonOA(ActionEvent actionEvent) {
        System.out.println("Register button clicked");

        String batchId = batchIdTextField.getText() ;
        String eggType = eggTypeComboBox.getValue() ;
        int eggQuantity = Integer.parseInt(eggQuantityTextField.getText()) ;
        LocalDate collectionDate = collectionDateDatePicker.getValue() ;
        LocalDate registrationDate = registrationDateDatePicker.getValue() ;

        EggBatch eggBatch = new EggBatch(batchId, eggType, eggQuantity, collectionDate, registrationDate) ;

        tableViewId.getItems().add(eggBatch) ;

        messageLabel.setText("Egg Batch Registered Successfully") ;
    }
}