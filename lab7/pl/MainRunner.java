package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImp;

public class MainRunner {
	static Scanner sc = new Scanner(System.in);
	static EmployeeServiceImp esi = new EmployeeServiceImp();
	static Employee emp = new Employee();
	static MainRunner myObj = new MainRunner();
	private int emp_id = 100;

	public static void main(String[] args) {

		while (true) {
			System.out.println("==================Employee Insurance System===================");
			System.out.println("1. Add Employee\n" + "2. Display employees\n"
					+ "3. Display Employee by Insurance Scheme\n" + "4.Delete employee with id\n"
							+ "5.Exit");
			System.out.println("Enter your choice:");

			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:

				myObj.insertEmp();
				break;
			case 2:
				myObj.displayEmp();
				break;
			case 3:
				myObj.displayEmpByScheme();
				break;
			case 4:
				myObj.deleteEmployeeByID();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Selection");
			}
		}
	}

	public void insertEmp() {

		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Salary");
		double salary = Integer.parseInt(sc.nextLine());
		System.out.println(
				"select Designation\n" + "1. System Associate\n" + "2. Programmer\n" + "3. Manager\n" + "4. Clerk\n");
		System.out.println("Enter choice");
		int ch = Integer.parseInt(sc.nextLine());
		String designation = "";
		String scheme = "";
		do {
			switch (ch) {
			case 1:

				designation = "System Associate";
				scheme = "Scheme C";
				break;
			case 2:
				designation = "Programmer";
				scheme = "Scheme B";
				break;
			case 3:
				designation = "Manager";
				scheme = "Scheme A";
				break;
			case 4:
				designation = "Clerk";
				scheme = "No Scheme";
				break;
			default:
				System.out.println("Invalid selection");
				ch = 0;
			}
		} while (ch == 0);
		try {
		esi.insertEmployee(new Employee(myObj.genId(), name, salary, designation, scheme));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void displayEmp() {
		System.out.println("\n===========All Employees Details ===========\n");
		List<Employee> myempList = esi.getAllEmployees();
		for (Employee e : myempList) {
			System.out.println(e);
		}

	}

	public void displayEmpByScheme() {
		System.out.println("Enter the scheme name:");
		String schm = sc.nextLine();
		Set<Employee> myempList = esi.getAllEmployeesByInsurance(schm);
		if ((myempList==null)||(myempList.isEmpty())) {
			System.out.println("No scheme found");
		} else {
			System.out.println("\n===========All Employees Details by "+schm+" ===========\n");
			
			for (Employee e : myempList) {
				System.out.println(e);
			}
		}
	}
	public void deleteEmployeeByID() {
		System.out.println("Enter the id to be deleted");
		int id=Integer.parseInt(sc.nextLine());
        if(esi.deleteEmployee(id)) {
        	System.out.println("Employe with id: "+id+" removed");
        }
        else {
        	System.out.println("No employe found with id: "+id);
            
        }
	}
	private int genId() {
		return this.emp_id++;

	}
}// class ends
