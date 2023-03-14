package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    public List<Employee> employeeList(){
        return employeeDao.findAll();
    }
    @Transactional
    public void createDb(){
        Employee e1=new Employee(1,"John","wick","johnwick@gmail.com",3343);
        Employee e2=new Employee(2,"Gabriel","Martenelli","martenelli@gmail.com",45464);
        Employee e3=new Employee(3,"Neymar","Junior","neymar@gmail.com",5454);
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);
    }
}
