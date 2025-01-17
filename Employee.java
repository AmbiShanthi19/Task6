

package task6;

public class Employee {
	// Declare a private variable to store the name of the employee
    private String Firstname;
    // Declare a private variable to store the Lastname of the employee
    private String Lastname;
    // Declare a private variable to store the salary of the employee
    private double salary;

    // Constructor for the Employee class that initializes the name,  Lastname, and salary variables
    public Employee(String Firstname, String Lastname, double salary) {
        // Set the name variable to the provided name parameter
        this.Firstname = Firstname;
        // Set the Lastname variable to the provided Lastname parameter
        this.Lastname = Lastname;
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to retrieve the Firstname of the employee
    public String getFirstname() {
        // Return the value of the name variable
        return Firstname;
    }

    // Method to set the name of the employee
    public void setFirstname(String Firstname) {
        // Set the name variable to the provided name parameter
        this.Firstname = Firstname;
    }

    // Method to retrieve the Lastname of the employee
    public String getLastname() {
        // Return the value of the Lastname variable
        return Lastname;
    }

    // Method to set the Lastname of the employee
    public void setLastname(String Lastname) {
        // Set the Lastname variable to the provided jobTitle parameter
        this.Lastname = Lastname;
    }

    // Method to retrieve the salary of the employee
    public double getSalary() {
        // Return the value of the salary variable
        return salary;
    }

    // Method to set the salary of the employee
    public void setSalary(double salary) {
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to raise the salary of the employee by a given percentage
    public void raiseSalary(double percentage) {
        // Calculate the new salary by increasing the current salary by the given percentage
        salary = salary + salary * percentage / 100;
    }

    // Method to print the details of the employee
    public void printEmployeeDetails() {
        // Print the name of the employee
        System.out.println("Firstname: " + Firstname);
        // Print the job title of the employee
        System.out.println("Lastname: " + Lastname);
        // Print the salary of the employee
        System.out.println("Salary: " + salary);
    }
}

