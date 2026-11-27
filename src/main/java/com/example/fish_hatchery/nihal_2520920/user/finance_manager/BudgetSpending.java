package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

public class BudgetSpending {

        private String budgetId;
        private String category;
        private double budgetAmount;
        private double amountSpent;
        private String month;


    public BudgetSpending(String budgetId, String category,
                              double budgetAmount, double amountSpent,
                              String month) {
            this.budgetId = budgetId;
            this.category = category;
            this.budgetAmount = budgetAmount;
            this.amountSpent = amountSpent;
            this.month = month;
        }

        public String getBudgetId() {
            return budgetId;
        }

        public String getCategory() {
            return category;
        }

        public double getBudgetAmount() {
            return budgetAmount;
        }

        public double getAmountSpent() {
            return amountSpent;
        }

        public String getMonth() {
            return month;
        }

        public void setBudgetId(String budgetId) {
            this.budgetId = budgetId;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setBudgetAmount(double budgetAmount) {
            this.budgetAmount = budgetAmount;
        }

        public void setAmountSpent(double amountSpent) {
            this.amountSpent = amountSpent;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public double getRemainingBudget() {
            return budgetAmount - amountSpent;
        }

        @Override
        public String toString() {
            return "BudgetSpending [budgetId=" + budgetId
                    + ", category=" + category  + ", budgetAmount=" + budgetAmount
                    + ", amountSpent=" + amountSpent + ", month=" + month
                    + ", remainingBudget=" + getRemainingBudget() + "]";
        }
}





