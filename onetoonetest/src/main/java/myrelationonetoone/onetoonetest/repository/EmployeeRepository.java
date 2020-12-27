package myrelationonetoone.onetoonetest.repository;

import myrelationonetoone.onetoonetest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
