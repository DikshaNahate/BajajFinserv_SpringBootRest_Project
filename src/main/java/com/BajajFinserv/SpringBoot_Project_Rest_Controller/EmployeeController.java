package com.BajajFinserv.SpringBoot_Project_Rest_Controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.BajajFinserv.SpringBoot_Project_Rest_Model.Employee;
import com.BajajFinserv.SpringBoot_Project_Rest_Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
	
	return employeeService.saveEmployee(employee);
	
	}

}
