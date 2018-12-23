package ru.icoltd.springboot.springbootcruddemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.icoltd.springboot.springbootcruddemo.dao.EmployeeDAO;
import ru.icoltd.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    // temporarily: inject employee dao (use constructor injection)
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    // expose "/employees" and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
