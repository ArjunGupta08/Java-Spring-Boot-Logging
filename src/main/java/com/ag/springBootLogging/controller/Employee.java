package com.ag.springBootLogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employee {

    private static final Logger loginInfo = LoggerFactory.getLogger(Employee.class);

    @GetMapping(value = "{empId}")
    public String getEmployee(@PathVariable String empId){
        loginInfo.info("Logger enabled");
        return "Employee h.";
    }

}