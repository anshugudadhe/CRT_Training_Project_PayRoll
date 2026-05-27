package com.payroll.payslip.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import com.payroll.payslip.dto.AttendanceDTO;
import com.payroll.payslip.dto.EmployeeDTO;
import com.payroll.payslip.dto.PayslipResponse;

@RestController
@RequestMapping("/payslip")
public class PayslipController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{employeeId}")
    public PayslipResponse generatePayslip(
            @PathVariable int employeeId) {

        EmployeeDTO employee =
                restTemplate.getForObject(
                        "http://localhost:8081/employee/" + employeeId,
                        EmployeeDTO.class);

        AttendanceDTO attendance =
                restTemplate.getForObject(
                        "http://localhost:8082/attendance/" + employeeId,
                        AttendanceDTO.class);

        double salary =
                employee.getSalaryPerDay()
                        * attendance.getDaysPresent();

        return new PayslipResponse(
                employee.getEmployeeName(),
                employee.getDepartment(),
                attendance.getDaysPresent(),
                salary
        );
    }
}

