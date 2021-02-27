package com.vinod1.insertCsv;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int sno;

    private  String emailId;

    private String name;

    private  int contact;

}
