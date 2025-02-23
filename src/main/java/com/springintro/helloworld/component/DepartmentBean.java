package com.springintro.helloworld.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    public String getDeptName(){
        return "Full Stack Developer";
    }
}
