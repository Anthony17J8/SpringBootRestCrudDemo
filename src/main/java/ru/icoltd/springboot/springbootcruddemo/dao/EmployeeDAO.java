package ru.icoltd.springboot.springbootcruddemo.dao;

import ru.icoltd.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
