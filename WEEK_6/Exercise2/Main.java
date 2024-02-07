/*
(1) Write a class Employee with the following attributes.
• first name, last name, salary, year, employee id
(2) Write the following constructors for the Employee class.
• using default constructor
• using parameterized constructor
(3) Write the set (mutator) and get (accessor) methods for each of the attributes of the Employee
class.
(4) Write the following methods:
• getEmployeeStatus(int id): Returns employee’s status as the following rules:
i. if the employee id starts with 1, returns “Executive”
ii. if the employee id starts with 2, returns “Manager”
iii. otherwise, returns “Common Employee”
• getNewSalary(): Returns raised salary of the employee as the following:
i. if the employee’s status is “Common Employee”
• and if year is less than 5, increased salary with 10%.
• and if year is more than and equal 5, increased salary with 20%.
ii. otherwise, increased salary with 15%.
• displayDetails(): Displays the employee’s fistname, lastname, id and salary.
(5) Write a test class TestEmployee that
• creates 3 employee objects
• display these employee’s information (firstname, lastname, id, salary)
• also display employee status and new salary.

 */

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Kerem", "Sarı", 5,1000,12345);
        employee1.displayDetails();
        System.out.println("New Salary: "+ employee1.getNewSalary() );
        System.out.println("Statu: "+ employee1.getEmployeeStatus(employee1.getEmployee_id()));
        System.out.println();
        Employee employee2 = new Employee("Ayşe","Leyla",10,2000,23456);
        employee2.displayDetails();
        System.out.println("New Salary: " + employee2.getNewSalary());
        System.out.println("Statu: "+ employee2.getEmployeeStatus(employee2.getEmployee_id()));
    }
}