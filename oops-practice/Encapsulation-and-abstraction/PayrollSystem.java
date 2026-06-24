abstract class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee();
        ft.setEmployeeId(101);
        ft.setEmployeeName("Akash");
        ft.setMonthlySalary(50000);

        PartTimeEmployee pt = new PartTimeEmployee();
        pt.setEmployeeId(102);
        pt.setEmployeeName("Rahul");
        pt.setHoursWorked(80);
        pt.setHourlyRate(250);

        System.out.println("Full Time Employee:");
        ft.displayEmployeeInfo();
        System.out.println("Salary: " + ft.calculateSalary());

        System.out.println("\nPart Time Employee:");
        pt.displayEmployeeInfo();
        System.out.println("Salary: " + pt.calculateSalary());
    }
}