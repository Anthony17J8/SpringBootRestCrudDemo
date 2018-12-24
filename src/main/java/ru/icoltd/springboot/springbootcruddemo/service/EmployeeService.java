package ru.icoltd.springboot.springbootcruddemo.service;

import ru.icoltd.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
