package com.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Employee {
    @Id
    private Integer id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")

    private String last_name;

    private String email;
    private double salary;

    public Employee() {
    }

    public Employee(int id,String first_name, String last_name, String email, double salary) {
        this.id=id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.salary = salary;
    }
}
