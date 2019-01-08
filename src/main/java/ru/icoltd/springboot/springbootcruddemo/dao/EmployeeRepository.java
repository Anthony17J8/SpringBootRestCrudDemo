package ru.icoltd.springboot.springbootcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icoltd.springboot.springbootcruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
