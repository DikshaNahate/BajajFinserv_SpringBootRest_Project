package com.BajajFinserv.SpringBoot_Project_Rest_ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BajajFinserv.SpringBoot_Project_Rest_Model.Employee;
import com.BajajFinserv.SpringBoot_Project_Rest_Repository.EmployeeRepository;
import com.BajajFinserv.SpringBoot_Project_Rest_Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
	
		return employeeRepository.save(employee);
	}

}
