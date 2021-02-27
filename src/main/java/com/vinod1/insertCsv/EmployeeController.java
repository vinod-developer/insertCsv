package com.vinod1.insertCsv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    @RequestMapping(path = "/feedEmp")
    public String setDatainDB(){
        employeeService.saveEmployeeData();
        return "Data inserted successfully";
    }
}
