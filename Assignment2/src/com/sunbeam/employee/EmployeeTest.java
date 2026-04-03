package com.sunbeam.employee;

public class EmployeeTest {
	void displaySal() {

		Employee emp1 = new Employee("Vaishnavi", "Jaju", 90000.0);
		System.out.println("Yearly salary of employee1 : "+ emp1.getSalary()*12);

		Employee emp2 = new Employee("Sumit", "Shrivas", 80000.0);
		System.out.println("Yearly salary of employee2 : "+ emp2.getSalary()*12);

		emp1.setSalary(emp1.getSalary()*1.1);
		emp2.setSalary(emp2.getSalary()*1.1);
		
		System.out.println("Yearly salary of employee1 after hike: "+ emp1.getSalary()*12);
		System.out.println("Yearly salary of employee2 after hike: "+ emp2.getSalary()*12);

	}

}
