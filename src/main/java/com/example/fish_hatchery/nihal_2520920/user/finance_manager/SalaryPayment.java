package com.example.fish_hatchery.nihal_2520920.user.finance_manager;




import java.time.LocalDate;

public class SalaryPayment {

    private String paymentId;
    private String employeeName;
    private double salaryAmount;
    private LocalDate paymentDate;
    private String paymentStatus;
    private String description;

    public SalaryPayment(String paymentId, String employeeName,
                         double salaryAmount, LocalDate paymentDate,
                         String paymentStatus, String description) {

        this.paymentId = paymentId;
        this.employeeName = employeeName;
        this.salaryAmount = salaryAmount;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.description = description;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SalaryPayment{" +
                "paymentId=" + paymentId +
                ", employeeName=" + employeeName +
                ", salaryAmount=" + salaryAmount +
                ", paymentDate=" + paymentDate +
                ", paymentStatus=" + paymentStatus +
                ", description=" + description + '}';
    }
}
