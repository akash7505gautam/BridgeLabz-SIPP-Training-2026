import java.io.*;
import java.util.Scanner;

public class EmployeeSkillAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, department, salary);
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Employee object serialized successfully.");
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employee.ser"));
            Employee recovered = (Employee) ois.readObject();
            ois.close();
            System.out.println("\nRecovered Employee Information");
            System.out.println("Employee ID : " + recovered.employeeId);
            System.out.println("Name        : " + recovered.name);
            System.out.println("Department  : " + recovered.department);
            System.out.println("Salary      : " + recovered.salary);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}