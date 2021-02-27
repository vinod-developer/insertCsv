package com.vinod1.insertCsv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDTO employeeDTO;

    String line = "";

    public  void saveEmployeeData(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/buzInsertTask1.csv"));
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                EmployeeDetails employee = new EmployeeDetails();
                employee.setSno(Integer.parseInt(data[0]));
                employee.setEmailId(data[1]);
                employee.setName(data[2]);
                employee.setContact(Integer.parseInt(data[3]));
                employeeDTO.save(employee);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
