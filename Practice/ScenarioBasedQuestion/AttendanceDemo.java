import java.util.ArrayList;
import java.util.HashMap;

class AttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark Attendance
    void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student +
                    " marked present in " + subject);
        } else {
            System.out.println(student +
                    " already marked present in " + subject);
        }
    }

    // Display Attendance
    void displayAttendance() {

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students =
                    attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Present: "
                    + students.size());
        }
    }
}

public class AttendanceDemo {

    public static void main(String[] args) {

        AttendanceTracker tracker =
                new AttendanceTracker();

        tracker.markAttendance("Java", "Aman");
        tracker.markAttendance("Java", "Riya");

        tracker.markAttendance("Python", "Karan");
        tracker.markAttendance("Python", "Aman");

        tracker.markAttendance("DBMS", "Riya");

        // Duplicate Attendance
        tracker.markAttendance("Java", "Aman");

        tracker.displayAttendance();
    }
}