package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class JarAssignmentRecordsController
{
    @javafx.fxml.FXML
    private TableColumn<JarAssignment, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<JarAssignment, String> batchIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<JarAssignment, String> jarIdTableColumn;
    @javafx.fxml.FXML
    private Label assignmentRecordsLabel;
    @javafx.fxml.FXML
    private TableView<JarAssignment> tableViewId;
    @javafx.fxml.FXML
    private TableColumn<JarAssignment, Integer> eggCountTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        batchIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        jarIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("jarId"));
        eggCountTableColumn.setCellValueFactory(new PropertyValueFactory<>("eggCount"));
    }}