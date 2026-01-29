/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987,"Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(10);
		dwight.employeeToString();
		System.out.println("Annual salary: "+dwight.getAnnualSalary());
		
		Employee jim = new Employee(2474,"Jim", "Halpert", 4416.66);
		jim.raiseSalary(20);
		jim.employeeToString();
		System.out.println("Annual salary: "+ jim.getAnnualSalary());
		
		Employee pam = new Employee(2011,"Pam", "Beesly", 2250);
		pam.raiseSalary(95);
		pam.employeeToString();
		System.out.println("Annual salary: " + pam.getAnnualSalary());
		
		Employee phyllis = new Employee(2078,"Phyllis", "Vance", 2260);
		phyllis.raiseSalary(90);
		phyllis.employeeToString();
		System.out.println("Annual salary: " + phyllis.getAnnualSalary());
		
		
		
		
	}
}
