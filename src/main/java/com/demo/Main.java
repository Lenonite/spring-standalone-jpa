package com.demo;

import com.demo.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        EmployeeService employeeService=context.getBean(EmployeeService.class);
        employeeService.createDb();
        employeeService.employeeList().forEach(System.out::println);
    }
}
