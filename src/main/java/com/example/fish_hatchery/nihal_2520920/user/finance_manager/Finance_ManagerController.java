package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Finance_ManagerController
{
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TableColumn yearColumn;
    @javafx.fxml.FXML
    private TextField monthTextField;
    @javafx.fxml.FXML
    private TableColumn monthColumn;
    @javafx.fxml.FXML
    private TableColumn incomeColumn;
    @javafx.fxml.FXML
    private TableView financialStatusTable;
    @javafx.fxml.FXML
    private TextField yearTextField;
    @javafx.fxml.FXML
    private TableColumn expenseColumn;
    @javafx.fxml.FXML
    private TextField expenseTextField;
    @javafx.fxml.FXML
    private TableColumn salaryColumn;
    @javafx.fxml.FXML
    private TableColumn balanceColumn;
    @javafx.fxml.FXML
    private TextField incomeTextField;
    @javafx.fxml.FXML
    private TextField filterMonthTextField;
    @javafx.fxml.FXML
    private TextField filterYearTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleReset(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleFilter(ActionEvent actionEvent) {
    }

    public TextField getSalaryTextField() {
        return salaryTextField;
    }

    public void setSalaryTextField(TextField salaryTextField) {
        this.salaryTextField = salaryTextField;
    }

    public TableColumn getYearColumn() {
        return yearColumn;
    }

    public void setYearColumn(TableColumn yearColumn) {
        this.yearColumn = yearColumn;
    }

    public TextField getMonthTextField() {
        return monthTextField;
    }

    public void setMonthTextField(TextField monthTextField) {
        this.monthTextField = monthTextField;
    }

    public TableColumn getMonthColumn() {
        return monthColumn;
    }

    public void setMonthColumn(TableColumn monthColumn) {
        this.monthColumn = monthColumn;
    }

    public TableColumn getIncomeColumn() {
        return incomeColumn;
    }

    public void setIncomeColumn(TableColumn incomeColumn) {
        this.incomeColumn = incomeColumn;
    }

    public TableView getFinancialStatusTable() {
        return financialStatusTable;
    }

    public void setFinancialStatusTable(TableView financialStatusTable) {
        this.financialStatusTable = financialStatusTable;
    }

    public TextField getYearTextField() {
        return yearTextField;
    }

    public void setYearTextField(TextField yearTextField) {
        this.yearTextField = yearTextField;
    }

    public TableColumn getExpenseColumn() {
        return expenseColumn;
    }

    public void setExpenseColumn(TableColumn expenseColumn) {
        this.expenseColumn = expenseColumn;
    }

    public TextField getExpenseTextField() {
        return expenseTextField;
    }

    public void setExpenseTextField(TextField expenseTextField) {
        this.expenseTextField = expenseTextField;
    }

    public TableColumn getSalaryColumn() {
        return salaryColumn;
    }

    public void setSalaryColumn(TableColumn salaryColumn) {
        this.salaryColumn = salaryColumn;
    }

    public TableColumn getBalanceColumn() {
        return balanceColumn;
    }

    public void setBalanceColumn(TableColumn balanceColumn) {
        this.balanceColumn = balanceColumn;
    }

    public TextField getIncomeTextField() {
        return incomeTextField;
    }

    public void setIncomeTextField(TextField incomeTextField) {
        this.incomeTextField = incomeTextField;
    }

    public TextField getFilterMonthTextField() {
        return filterMonthTextField;
    }

    public void setFilterMonthTextField(TextField filterMonthTextField) {
        this.filterMonthTextField = filterMonthTextField;
    }

    public TextField getFilterYearTextField() {
        return filterYearTextField;
    }

    public void setFilterYearTextField(TextField filterYearTextField) {
        this.filterYearTextField = filterYearTextField;
    }

    @javafx.fxml.FXML
    public void handleAddStatus(javafx.event.ActionEvent actionEvent) {
    }
}