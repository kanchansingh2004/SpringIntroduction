package com.springintro.helloworld.controller;

import com.springintro.helloworld.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    //creating a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    //method to log different levels of messages when "/api/log" is accessed
    @GetMapping("/log")
    public String logMessages() {
        logger.info("Information of logMessages() method");
        logger.debug("Debugging log");
        logger.warn("warning");
        logger.error("ERROR");
        //returning a response to indicate logs have been recorded
        return "Logs have been recorded.";
    }
}
