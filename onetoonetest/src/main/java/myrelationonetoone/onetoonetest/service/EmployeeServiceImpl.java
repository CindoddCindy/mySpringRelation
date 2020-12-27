package myrelationonetoone.onetoonetest.service;

import myrelationonetoone.onetoonetest.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee createEmployee(Employee emp) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return null;
    }

    @Override
    public Employee getEmployee(Long empId) {
        return null;
    }

    @Override
    public void deleteEmployee(Long empId) {

    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
