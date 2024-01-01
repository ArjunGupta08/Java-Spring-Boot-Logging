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
    public String getEmployee(@PathVariable String empId) {
        loginInfo.info("Logger enabled");

       /*
        THERE ARE TWO TYPES OF LOGGING SYSTEM AVAILABLE : ->
        1) - USING SLF4J
        2) - USING LOGBACK

         If (U r using slf4j) {
             Use application.yaml to enable debug Log
         } else if (U r using LogBack) {
             Use logback.xml to enable debug Log
             logback create a full logs file.
         }*/

        loginInfo.debug("Debug enabled");
        return "Employee h.";
    }

}