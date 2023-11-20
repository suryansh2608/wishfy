package in.wishfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wishfy.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
