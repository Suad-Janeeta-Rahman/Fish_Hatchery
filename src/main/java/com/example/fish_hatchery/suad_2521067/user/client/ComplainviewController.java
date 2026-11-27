package com.example.fish_hatchery.suad_2521067.user.client;

import javafx.scene.control.*;

import java.time.LocalDate;

public class ComplainviewController
{
    @javafx.fxml.FXML
    private ComboBox<Complain> issueCategoryComboBox;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> speciesNameCol;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> complainIdCol;
    @javafx.fxml.FXML
    private TextField complainIDTextField;
    @javafx.fxml.FXML
    private ComboBox<Complain> orderIdComboBox;
    @javafx.fxml.FXML
    private Label buyerIdLabel;
    @javafx.fxml.FXML
    private Label issueCategoryLabel;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> descriptionCol;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> buyerIdCol;
    @javafx.fxml.FXML
    private Label orderIdLabel;
    @javafx.fxml.FXML
    private Label affectedQuantityLabel;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> issueCategoryCol;
    @javafx.fxml.FXML
    private Label speciesNameLabel;
    @javafx.fxml.FXML
    private TextField buyerIdTextField;
    @javafx.fxml.FXML
    private Label complainIDLabel;
    @javafx.fxml.FXML
    private Label complaintDateLabel;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableView<Complain> tableView;
    @javafx.fxml.FXML
    private TextField affectedQuantityTextField;
    @javafx.fxml.FXML
    private TextField speciesNameTextField;
    @javafx.fxml.FXML
    private Label complainLabel;
    @javafx.fxml.FXML
    private TableColumn<Complain, String> orderIdCol;
    @javafx.fxml.FXML
    private TableColumn<Complain, Integer> affectedQuantityCol;
    @javafx.fxml.FXML
    private TableColumn<Complain, LocalDate> complaintDateCol;
    @javafx.fxml.FXML
    private DatePicker complaintDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backTodashboardMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitComplaintMouseClick(ActionEvent actionEvent) {
    }
}