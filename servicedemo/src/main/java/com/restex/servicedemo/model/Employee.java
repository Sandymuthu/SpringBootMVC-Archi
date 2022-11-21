package com.restex.servicedemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="empid")
    private int empid;
    @Column(name="name")
    private String name;
    @Column(name="dob")
    private Date dob;
    public int getEmpid() {
        return empid;
    }
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", dob=" + dob + "]";
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public Employee() {
    }
    public Employee(int empid, String name, Date dob) {
        this.empid = empid;
        this.name = name;
        this.dob = dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    

}
