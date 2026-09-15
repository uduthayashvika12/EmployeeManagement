package demo;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee() ;
		Attendance attendance = new Attendance();
		Salary salary = new Salary();
		int choice;
		do {
			System.out.println("\n==========================");
			System.out.println("EMPLOYEE ATTENDANCE & PAYROLL SYSTEM");
			System.out.println("==========================");
			System.out.println("1.Enter Employee Details");
			System.out.println("2.Calculate Attendance");
			System.out.println("3. Calculate Salary");
			System.out.println("4. Display Employee Details");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			  
			  case 1:
				  System.out.println("\n---ENTER EMPLOYEE DETAILS ---");
				  System.out.print("Enter Employee ID: ");
				  employee.employeeId = sc.nextInt();
				  sc.nextLine();
				  System.out.print("EnterbEmployee Name: ");
				  employee.employeeName = sc.nextLine();
				  System.out.println("\nSelect Department:");
				  System.out.println("1. IT");
				  System.out.println("2. HR");
				  System.out.println("3. Finance");
				  System.out.println("4. Marketing");
				  
				  System.out.println("Enter Department Choice: ");
				  employee.departmentChoice = sc.nextInt();
				  switch (employee.departmentChoice) {
				  case 1:
					  employee.department = "IT";
					  break;
				  case 2:
					  employee.department = "HR";
					  break;
				  case 3:
					  employee.department = "Finance";
					  break;
				  case 4:
					  employee.department = "Marketing";
					  break;
				  default:
					  employee.department = "Unknown";
					  
					  System.out.println("Invalid department choice.");
					  
				  }
				   
				  System.out.print("Enter Basic Salary: ");
				  employee.basicSalary = sc.nextDouble();
				  
				  if (employee.basicSalary > 0) {
					  System.out.println("Employee details entered successfully.");
				  } else {
					  System.out.println("Invalid salary. Salary must be greater than zero.");
					  
				  }
				  break;
				  default:
					  System.out.println("Invalid menu choice. Please enter 1 to 5.");
				  		
				  
			}
			
		}
		while (choice != 1);
		sc.close();
				

	}

}