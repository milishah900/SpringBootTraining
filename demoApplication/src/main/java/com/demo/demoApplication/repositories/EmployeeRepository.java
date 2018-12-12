package com.demo.demoApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demoApplication.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
