package com.springintro.helloworld.controller;

import com.springintro.helloworld.component.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    //Display message using rest controller
    public String call(){
        return "Hello from BridgeLabz";
    }

    @Autowired
    private EmployeeBean employeeBean;

    // method to GET /api/employee
    @GetMapping("/employee")
    public String getEmployeeDetails() {
        // Setting Employee Details
        employeeBean.setId(101);
        employeeBean.setName("Spring Framework Expert");

        // Returning details
        return "Employee ID: " + employeeBean.getId() + ", "
                + "Employee Name: " + employeeBean.getName() + ", "
                + "Department: " + employeeBean.getDeptName();
    }
}
