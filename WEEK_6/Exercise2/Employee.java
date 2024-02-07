public class Employee {

    //Variables
    private String first_name;
    private String last_name;
    private int year;
    private double salary;
    private int employee_id;


    //Getter -Setter
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    // Constructor
    public Employee(String first_name, String last_name, int year, double salary, int employee_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.year = year;
        this.salary = salary;
        this.employee_id = employee_id;
    }

    public double getNewSalary() {
        double new_salary;
        String statu = getEmployeeStatus(this.employee_id);
        if (statu.equals("Common Employee")) {
            if (year < 5) {
                return salary + salary * 0.1;
            } else {
                return salary + salary * 0.2;
            }
        } else {
            return salary + salary * 0.15;
        }
    }

    public String getEmployeeStatus(int id) {
        if (String.valueOf(id).startsWith("1")) {
            return "Executive";
        } else if (String.valueOf(id).startsWith("2")) {
            return "Manager";
        } else {
            return "Common Employee";
        }
    }

    public void displayDetails() {
        System.out.println("First name: " + this.first_name);
        System.out.println("Last name: " + this.last_name);
        System.out.println("Id: " + this.employee_id);
        System.out.println("Salary: " + this.salary);

    }
}