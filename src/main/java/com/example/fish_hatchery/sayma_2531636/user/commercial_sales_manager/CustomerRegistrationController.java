package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomerRegistrationController
{
    @javafx.fxml.FXML
    private Label generatedCustomerIdLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerRegistration, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<CustomerRegistration, String> typeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> customerTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<CustomerRegistration, String> contactTableColumn;
    @javafx.fxml.FXML
    private TableView<CustomerRegistration> tableViewId;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerRegistration, String> customerIdTableColumn;
    @javafx.fxml.FXML
    private Label customerRegistrationLabel;
    @javafx.fxml.FXML
    private TextField contactNumberOrEmailtextField;

    @javafx.fxml.FXML
    public void initialize() {
        customerTypeComboBox.getItems().addAll("Fish Farm", "Fish Wholesaler", "Fish Retailer", "Aquaculture Business", "Individual Customer") ;

        customerIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        contactTableColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerType"));
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        customerNameTextField.clear() ;
        contactNumberOrEmailtextField.clear() ;

        customerTypeComboBox.setValue(null);

        customerRegistrationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
    }
}