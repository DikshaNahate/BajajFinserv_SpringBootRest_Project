package com.BajajFinserv.SpringBoot_Project_Rest_Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BajajFinserv.SpringBoot_Project_Rest_Model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
