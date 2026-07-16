interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}
interface Reportable {
    void generateReport();
}
interface Notifiable {
    void sendAlert();
}
class FitnessDevice implements Trackable, Reportable, Notifiable {
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }
    public void generateReport() {
        System.out.println("Report Generated: Calories Burned = 350.");
    }
    public void sendAlert() {
        System.out.println("Alert: Daily fitness goal achieved!");
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();
        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}
