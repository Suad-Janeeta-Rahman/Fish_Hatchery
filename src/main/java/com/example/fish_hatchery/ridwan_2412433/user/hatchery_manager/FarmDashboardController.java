package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FarmDashboardController
{
    @javafx.fxml.FXML
    private TableView<FarmDashboard> dashboardTableView;
    @javafx.fxml.FXML
    private TextField totalPondsTextField;
    @javafx.fxml.FXML
    private TextField totalFishTextField;
    @javafx.fxml.FXML
    private TextField totalBatchesTextField;
    @javafx.fxml.FXML
    private TextField totalMortalityTextField;
    @javafx.fxml.FXML
    private Label totalBatchesLabel;
    @javafx.fxml.FXML
    private TableColumn<FarmDashboard, Integer> pondsCol;
    @javafx.fxml.FXML
    private TableColumn<FarmDashboard, Integer> batchesCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusFilterComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> inputStatusComboBox;
    @javafx.fxml.FXML
    private Label totalMortalityLabel;
    @javafx.fxml.FXML
    private Label farmStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<FarmDashboard, Integer> fishCol;
    @javafx.fxml.FXML
    private Label totalPondsLabel;
    @javafx.fxml.FXML
    private TableColumn<FarmDashboard, String> statusCol;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private Label totalFishLabel;
    @javafx.fxml.FXML
    private TableColumn<FarmDashboard, Integer> mortalityCol;
    @javafx.fxml.FXML
    private CheckBox abnormalOnlyCheckBox;

    private ArrayList<FarmDashboard> dashboardList = new ArrayList<>();
    private final String FILE_NAME = "farm_dashboard_data.bin";

    @javafx.fxml.FXML
    public void initialize() {
        pondsCol.setCellValueFactory(new PropertyValueFactory<>("totalPonds"));
        fishCol.setCellValueFactory(new PropertyValueFactory<>("totalFish"));
        batchesCol.setCellValueFactory(new PropertyValueFactory<>("totalBatches"));
        mortalityCol.setCellValueFactory(new PropertyValueFactory<>("totalMortality"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("farmStatus"));

        statusFilterComboBox.getItems().addAll("All", "Optimal", "Warning", "Critical");
        inputStatusComboBox.getItems().addAll("Optimal", "Warning", "Critical");
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void updateSummaryLabels(FarmDashboard data) {
        totalPondsLabel.setText("Total Ponds: " + data.getTotalPonds());
        totalFishLabel.setText("Total Fish: " + data.getTotalFish());
        totalBatchesLabel.setText("Total Batches: " + data.getTotalBatches());
        totalMortalityLabel.setText("Total Mortality: " + data.getTotalMortality());
        farmStatusLabel.setText("Farm Status: " + data.getFarmStatus());
    }

    private void switchScene(ActionEvent event, String fxmlFileName) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void feedInventoryButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "feedInventoryView.fxml");
    }

    @javafx.fxml.FXML
    public void diseaseReportsButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "diseaseReportsView.fxml");
    }

    @javafx.fxml.FXML
    public void fishStockButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "fishStockView.fxml");
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        statusFilterComboBox.setValue(null);
        filterDatePicker.setValue(null);
        abnormalOnlyCheckBox.setSelected(false);

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            showAlert(Alert.AlertType.ERROR, "No Data", "No saved file found yet.");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        dashboardList = (ArrayList<FarmDashboard>) ois.readObject();
        ois.close();
        fis.close();

        dashboardTableView.getItems().clear();
        dashboardTableView.getItems().addAll(dashboardList);

        if (!dashboardList.isEmpty()) {
            updateSummaryLabels(dashboardList.get(dashboardList.size() - 1));
        }
    }

    @javafx.fxml.FXML
    public void applyFilterButton(ActionEvent actionEvent) {
        String selectedStatus = statusFilterComboBox.getValue();
        boolean onlyCritical = abnormalOnlyCheckBox.isSelected();

        if ((selectedStatus == null || selectedStatus.equals("All")) && !onlyCritical) {
            dashboardTableView.getItems().clear();
            dashboardTableView.getItems().addAll(dashboardList);
            return;
        }

        ArrayList<FarmDashboard> filteredList = new ArrayList<>();

        for (FarmDashboard item : dashboardList) {
            if (onlyCritical) {
                if (item.getFarmStatus().equals("Critical")) {
                    filteredList.add(item);
                }
            } else {
                if (item.getFarmStatus().equals(selectedStatus)) {
                    filteredList.add(item);
                }
            }
        }

        dashboardTableView.getItems().clear();
        dashboardTableView.getItems().addAll(filteredList);
    }

    @javafx.fxml.FXML
    public void farmDecisionButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "farmDecisionView.fxml");
    }

    @javafx.fxml.FXML
    public void waterQualityButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "waterQualityView.fxml");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        if (totalPondsTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter Total Ponds.");
            return;
        } else if (totalFishTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter Total Fish.");
            return;
        } else if (totalBatchesTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter Total Batches.");
            return;
        } else if (totalMortalityTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter Total Mortality.");
            return;
        } else if (inputStatusComboBox.getValue() == null) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please select Farm Status.");
            return;
        }

        int ponds = Integer.parseInt(totalPondsTextField.getText());
        int fish = Integer.parseInt(totalFishTextField.getText());
        int batches = Integer.parseInt(totalBatchesTextField.getText());
        int mortality = Integer.parseInt(totalMortalityTextField.getText());

        if (ponds < 0 || fish < 0 || batches < 0 || mortality < 0) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Values cannot be negative.");
            return;
        }

        String status = inputStatusComboBox.getValue();

        File file = new File(FILE_NAME);
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            dashboardList = (ArrayList<FarmDashboard>) ois.readObject();
            ois.close();
            fis.close();
        }

        FarmDashboard newRecord = new FarmDashboard(ponds, fish, batches, mortality, status);
        dashboardList.add(newRecord);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dashboardList);
        oos.close();
        fos.close();

        updateSummaryLabels(newRecord);

        totalPondsTextField.clear();
        totalFishTextField.clear();
        totalBatchesTextField.clear();
        totalMortalityTextField.clear();
        inputStatusComboBox.setValue(null);

        showAlert(Alert.AlertType.INFORMATION, "Saved", "Data saved to file! Click Refresh to view in table.");
    }

    @javafx.fxml.FXML
    public void productionStatsButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "productionStatisticsView.fxml");
    }

    @javafx.fxml.FXML
    public void operationsButtonOA(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "hatcheryOperationsView.fxml");
    }

    @javafx.fxml.FXML
    public void signOutButton(ActionEvent actionEvent) {
    }
}