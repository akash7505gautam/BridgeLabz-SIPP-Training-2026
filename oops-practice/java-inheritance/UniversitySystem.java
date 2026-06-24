class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private final String studentId;
    protected double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Student ID: " + studentId +
               ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    GradStudent(String name, int age, String studentId,
                double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Akash", 22, "S101", 8.9,
                "Artificial Intelligence");

        System.out.println(gs);

        
        Student s = gs;   
        Person p = gs;    

        System.out.println("\nAs Student:");
        System.out.println(s);

        System.out.println("\nAs Person:");
        System.out.println(p);
    }
}