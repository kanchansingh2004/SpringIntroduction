package com.springintro.helloworld.component;
//Import required Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    //Instance Variables
    private int id;
    private String name;

    @Autowired
    private DepartmentBean department;

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Get the department name
    public String getDeptName(){
        return department.getDeptName();
    }
}
