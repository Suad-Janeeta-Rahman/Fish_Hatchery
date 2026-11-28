package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class LarvaeTransferController
{
    @javafx.fxml.FXML
    private Label transferHistoryLabel;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, String> batchIdTableColumn;
    @javafx.fxml.FXML
    private TextField larvaeQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, String> destinationTankTableColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private DatePicker transferDateDatePicker;
    @javafx.fxml.FXML
    private Label larvaeTransferFormLabel;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, LocalDate> transferDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> destinationTankComboBox;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, String> transferIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdComboBox;
    @javafx.fxml.FXML
    private TableView<LarvaeTransfer> tableViewId;
    @javafx.fxml.FXML
    private TableColumn<LarvaeTransfer, Integer> remainingLarvaeTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        batchIdComboBox.getItems().addAll("BATCH-1","BATCH-02", "BATCH-03", "BATCh-04") ;
        destinationTankComboBox.getItems().addAll("lT-001","LT-002", "LT-003", "LT-004") ;

        transferIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("transferId"));
        batchIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("larvaeQuantity"));
        destinationTankTableColumn.setCellValueFactory(new PropertyValueFactory<>("destinationTank"));
        transferIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("transferDate"));
        remainingLarvaeTableColumn.setCellValueFactory(new PropertyValueFactory<>("remainingDate"));

    }

    @javafx.fxml.FXML
    public void saveTransferButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        batchIdComboBox.setValue(null);
        destinationTankComboBox.setValue(null);

        larvaeQuantityTextField.clear() ;

        transferDateDatePicker.setValue(null);

        larvaeTransferFormLabel.setText("");
    }
}