package com.payroll.payslip.dto;


public class PayslipResponse {

    private String employeeName;
    private String department;
    private int daysPresent;
    private double totalSalary;

    public PayslipResponse(String employeeName,
                           String department,
                           int daysPresent,
                           double totalSalary) {

        this.employeeName = employeeName;
        this.department = department;
        this.daysPresent = daysPresent;
        this.totalSalary = totalSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}

