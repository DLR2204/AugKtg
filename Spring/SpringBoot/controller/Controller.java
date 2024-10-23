package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.Services;

@RestController
@RequestMapping("/emp")  //http://localhost:2222/emp
public class Controller {
	
	@Autowired
	Services service;
	
	@PostMapping("/addEmp")//http://localhost:2222/emp/addEmp
	public String insertEmp(@RequestBody Employee emp)
	{
		return service.addEmp(emp);
	}

	@PutMapping("/updateEmp") //http://localhost:2222/emp/updateEmp
	public String updateEmp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
	}
	
	@DeleteMapping("/deleteEmp/{eid}") //http://localhost:2222/emp/deleteEmp
	public String deleteEmp(@PathVariable("eid") int empId) {
		return service.deleteEmp(empId);
	}
	
	@GetMapping("/getEmp/{eid}")//http://localhost:2222/emp/getEmp
	public Employee getEmp(@PathVariable("eid") int empId) {
		return service.getEmp(empId);
	}
	
}
