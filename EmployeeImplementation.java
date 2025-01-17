

package task6;

public class EmployeeImplementation {

	public static void main(String[] args) {
		   // Create an instance of the Employee class
        Employee employee1 = new Employee("Fathima", "Begum", 55000);
        // Create another instance of the Employee class 
        Employee employee2 = new Employee("Athul", "raj", 75000);

        // Print a heading for the employee details section
        System.out.println("\nEmployee Details:");
        // Print the details of employee1
        employee1.printEmployeeDetails();
        // Print the details of employee2
        employee2.printEmployeeDetails();

        // Raise the salary of employee1 by 7%
        employee1.raiseSalary(7);
        // Raise the salary of employee2 by 10%
        employee2.raiseSalary(10);

        // Print a heading indicating that the salaries have been raised
        System.out.println("After raising salary:");
        // Print a heading for the salary raise details of employee1
        System.out.println("7% for 'Fathima':");
        // Print the updated details of employee1
        employee1.printEmployeeDetails();
        // Print a heading for the salary raise details of employee2
        System.out.println("10% for 'Athul Raj':");
        // Print the updated details of employee2
        employee2.printEmployeeDetails();
    }

	}


