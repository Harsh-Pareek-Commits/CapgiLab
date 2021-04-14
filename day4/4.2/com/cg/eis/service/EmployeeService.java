package com.cg.eis.service;
import com.cg.eis.bean.Employee;
public interface EmployeeService {
public Employee getEmpDetails(String id, double salary, String name, String designation);
public String  findInsurance(double sal,String designation); 
public void displayEmpDetails(Employee emp);
}
