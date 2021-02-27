package com.vinod1.insertCsv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDTO extends CrudRepository<EmployeeDetails,Integer> {
}
