package in.wishfy.service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import in.wishfy.entity.Employee;
import in.wishfy.repo.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    @Override
	    public Optional<Employee> getEmployeeById(Long id) {
	        return employeeRepository.findById(id);
	    }
	    @Override
	    public Employee createEmployee(Employee employee) {
	    	if (employee.getJoiningDate() == null) {
	            employee.setJoiningDate(new Date());
	        }
	        return employeeRepository.save(employee);
	    }
	    @Override
	    public Employee updateEmployee(Long id, Employee employee) {
	        Optional<Employee> existingEmployee = employeeRepository.findById(id);
	        if (existingEmployee.isPresent()) {
	            employee.setId(id);
	            return employeeRepository.save(employee);
	        } else {
	            return null;
	        }
	    }
	    @Override
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
 
}

