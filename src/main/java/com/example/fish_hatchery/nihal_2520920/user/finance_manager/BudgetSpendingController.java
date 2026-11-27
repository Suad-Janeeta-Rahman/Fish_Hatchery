
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetSpendingController {

    @FXML
    private TextField budgetIdTextField;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField budgetAmountTextField;

    @FXML
    private TextField amountSpentTextField;

    @FXML
    private ComboBox<String> monthComboBox;

    @FXML
    private TextField searchTextField;

    @FXML
    private ComboBox<String> filterCategoryComboBox;

    @FXML
    private ComboBox<String> filterMonthComboBox;

    @FXML
    private TableView<BudgetSpending> budgetTableView;

    @FXML
    private TableColumn<BudgetSpending, String> budgetIdColumn;

    @FXML
    private TableColumn<BudgetSpending, String> categoryColumn;

    @FXML
    private TableColumn<BudgetSpending, Double> budgetAmountColumn;

    @FXML
    private TableColumn<BudgetSpending, Double> amountSpentColumn;

    @FXML
    private TableColumn<BudgetSpending, String> monthColumn;

    @FXML
    private TableColumn<BudgetSpending, Double> remainingBudgetColumn;


    private ObservableList<BudgetSpending> budgetList =
            FXCollections.observableArrayList();

    private ObservableList<BudgetSpending> searchList =
            FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        categoryComboBox.setItems(
                FXCollections.observableArrayList(
                        "Feed Purchase",
                        "Employee Salary",
                        "Electricity",
                        "Water Supply",
                        "Equipment",
                        "Maintenance",
                        "Transportation",
                        "Other"
                )
        );

        monthComboBox.setItems(
                FXCollections.observableArrayList(
                        "January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"
                )
        );

        filterCategoryComboBox.setItems(
                FXCollections.observableArrayList(
                        "All",
                        "Feed Purchase",
                        "Employee Salary",
                        "Electricity",
                        "Water Supply",
                        "Equipment",
                        "Maintenance",
                        "Transportation",
                        "Other"
                )
        );

        filterMonthComboBox.setItems(
                FXCollections.observableArrayList(
                        "All",
                        "January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"
                )
        );

        filterCategoryComboBox.setValue("All");
        filterMonthComboBox.setValue("All");

        budgetIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("budgetId"));

        categoryColumn.setCellValueFactory(
                new PropertyValueFactory<>("category"));

        budgetAmountColumn.setCellValueFactory(
                new PropertyValueFactory<>("budgetAmount"));

        amountSpentColumn.setCellValueFactory(
                new PropertyValueFactory<>("amountSpent"));

        monthColumn.setCellValueFactory(
                new PropertyValueFactory<>("month"));

        remainingBudgetColumn.setCellValueFactory(
                new PropertyValueFactory<>("remainingBudget"));

        budgetTableView.setItems(budgetList);
    }


    @FXML
    private void handleAddBudget(ActionEvent event) {

        try {

            String budgetId = budgetIdTextField.getText().trim();
            String category = categoryComboBox.getValue();
            String budgetText = budgetAmountTextField.getText().trim();
            String spentText = amountSpentTextField.getText().trim();
            String month = monthComboBox.getValue();

            if (budgetId.isEmpty() || category == null
                    || budgetText.isEmpty()
                    || spentText.isEmpty()
                    || month == null) {

                showAlert("Please fill in all fields.");
                return;
            }

            for (BudgetSpending budget : budgetList) {

                if (budget.getBudgetId().equalsIgnoreCase(budgetId)) {

                    showAlert("Budget ID already exists.");
                    return;
                }
            }

            double budgetAmount = Double.parseDouble(budgetText);
            double amountSpent = Double.parseDouble(spentText);

            if (budgetAmount <= 0 || amountSpent < 0) {

                showAlert("Enter valid budget and spending amounts.");
                return;
            }

            BudgetSpending budget = new BudgetSpending(
                    budgetId,
                    category,
                    budgetAmount,
                    amountSpent,
                    month
            );

            budgetList.add(budget);

            budgetTableView.setItems(budgetList);

            handleClear();

            showAlert("Budget record added successfully.");

        } catch (NumberFormatException e) {

            showAlert("Please enter valid numeric amounts.");
        }
    }


    @FXML
    private void handleSearch(ActionEvent event) {

        String keyword = searchTextField.getText()
                .trim().toLowerCase();

        String selectedCategory = filterCategoryComboBox.getValue();
        String selectedMonth = filterMonthComboBox.getValue();

        searchList.clear();

        for (BudgetSpending budget : budgetList) {

            boolean matchesSearch =
                    budget.getBudgetId().toLowerCase().contains(keyword)
                            || budget.getCategory().toLowerCase().contains(keyword);

            boolean matchesCategory =
                    selectedCategory == null
                            || selectedCategory.equals("All")
                            || budget.getCategory().equals(selectedCategory);

            boolean matchesMonth =
                    selectedMonth == null
                            || selectedMonth.equals("All")
                            || budget.getMonth().equals(selectedMonth);

            if (matchesSearch && matchesCategory && matchesMonth) {

                searchList.add(budget);
            }
        }

        budgetTableView.setItems(searchList);
    }


    @FXML
    private void handleReset(ActionEvent event) {

        searchTextField.clear();

        filterCategoryComboBox.setValue("All");
        filterMonthComboBox.setValue("All");

        budgetTableView.setItems(budgetList);
    }


    @FXML
    private void handleClear() {

        budgetIdTextField.clear();

        categoryComboBox.getSelectionModel().clearSelection();

        budgetAmountTextField.clear();

        amountSpentTextField.clear();

        monthComboBox.getSelectionModel().clearSelection();

        budgetTableView.getSelectionModel().clearSelection();
    }


    private void showAlert(String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(message);

        alert.showAndWait();
    }
}
