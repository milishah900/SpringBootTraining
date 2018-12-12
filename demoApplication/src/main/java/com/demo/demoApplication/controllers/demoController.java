package com.demo.demoApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoApplication.models.Employee;
import com.demo.demoApplication.repositories.EmployeeRepository;

@RestController
@RequestMapping("/all")
public class demoController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@RequestMapping(value = "/getData",method = RequestMethod.GET,produces= {"application/json"})
	public List<Employee> getEmployee() {
		
		return employeeRepo.findAll();
		
	}
	
	@RequestMapping(value="/createEmployee",method=RequestMethod.POST,produces= {"application/json"})
	public Employee createEmployee(@RequestBody Employee emp){
		Employee empdata = employeeRepo.save(emp);
		return empdata;
	}

}
