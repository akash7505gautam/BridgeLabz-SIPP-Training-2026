class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

class Student extends Person {
    protected final int studentId;
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Student [Student ID=" + studentId +
               ", GPA=" + gpa + "]";
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", GradStudent [Thesis=" + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent grad = new GradStudent(
                "Nishant", 22, 101, 8.9,
                "Artificial Intelligence in Education");

        System.out.println(grad);

        // Demonstrating IS-A relationship
        Student s = grad;   // GradStudent IS-A Student
        Person p = grad;    // GradStudent IS-A Person

        System.out.println("\nUsing Student reference:");
        System.out.println(s);

        System.out.println("\nUsing Person reference:");
        System.out.println(p);
    }
}