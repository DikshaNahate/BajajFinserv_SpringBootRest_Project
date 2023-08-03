package com.BajajFinserv.SpringBoot_Project_Rest_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long EmpId;
	private String EmpName;
	private String EmpMobileNumber;
	
	public Employee() {
		super();
		
	}

	public Employee(Long empId, String empName, String empMobileNumber) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpMobileNumber = empMobileNumber;
	}

	public Long getEmpId() {
		return EmpId;
	}

	public void setEmpId(Long empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpMobileNumber() {
		return EmpMobileNumber;
	}

	public void setEmpMobileNumber(String empMobileNumber) {
		EmpMobileNumber = empMobileNumber;
	}
	
	

}
