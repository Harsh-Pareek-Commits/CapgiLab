package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeServicesEmp;

public class EmpPortal {

	public static void main(String[] args) {
    EmployeServicesEmp emp=new EmployeServicesEmp();
    Employee e=emp.getEmpDetails("EMP2001", 45000, "Rohan", "HR");
   
    emp.findInsurance(e.getSalary(), e.getDesignation());
    e.setInsuranceScheme(emp.findInsurance(e.getSalary(), e.getDesignation()));
    emp.displayEmpDetails(e);
	}

}
