import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void display();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    public void display() {
        System.out.println("Exam Course: " + courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    public void display() {
        System.out.println("Assignment Course: " + courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    public void display() {
        System.out.println("Research Course: " + courseName);
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

public class UniversityManagement {

    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType course : list) {
            course.display();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Systems"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourses.addCourse(new ResearchCourse("Machine Learning"));

        displayCourses(examCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
        displayCourses(researchCourses.getCourses());
    }
}