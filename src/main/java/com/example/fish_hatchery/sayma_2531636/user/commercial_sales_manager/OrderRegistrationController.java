package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class OrderRegistrationController
{
    @javafx.fxml.FXML
    private ComboBox<String> productSizeComboBox;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder, String> orderIdTableColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder, String> customerIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder, String> statusTableColumn;
    @javafx.fxml.FXML
    private Label orderRegistrationLabel;
    @javafx.fxml.FXML
    private ComboBox<String> productSpeciesComboBox;
    @javafx.fxml.FXML
    private Label orderListLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder, Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private DatePicker orderDateDatePicker;
    @javafx.fxml.FXML
    private TableView<CustomerOrder> tableViewId;
    @javafx.fxml.FXML
    private ComboBox<String> customerIdComboBox;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder, String> productTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        customerIdComboBox.getItems().addAll("C001", "C002", "C003", "C004");
        productSpeciesComboBox.getItems().addAll("Rui", "Katla", "Hilsa", "Carp") ;
        productSizeComboBox.getItems().addAll("Small", "Medium", "Large") ;

        orderIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        productTableColumn.setCellValueFactory(new PropertyValueFactory<>("product"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void submitOrderButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        quantityTextField.clear() ;


    }
}