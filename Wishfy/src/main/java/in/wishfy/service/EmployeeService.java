package in.wishfy.service;
import java.util.List;
import java.util.Optional;

import in.wishfy.entity.Employee;

public interface EmployeeService {
	    List<Employee> getAllEmployees();
	    Optional<Employee> getEmployeeById(Long id);
	    Employee createEmployee(Employee employee);
	    Employee updateEmployee(Long id, Employee employee);
	    void deleteEmployee(Long id);
	}

