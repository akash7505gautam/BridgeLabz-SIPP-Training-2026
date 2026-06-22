class SpaceTourist {
    static int totalReservations = 0;
    static String missionName = "Moon Explorer";

    private String touristName;
    private int seatNumber;

    public SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    public SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public void displayDetails() {
        System.out.println("Mission Name: " + missionName);
        System.out.println("Tourist Name: " + touristName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Total Reservations: " + totalReservations);
    }
}
public class SpaceTourismReservationSystem {
    public static void main(String[] args) {
        SpaceTourist tourist = new SpaceTourist("Nishant", 5);

        tourist.updateSeatNumber(10)
               .updateSeatNumber(15);

        tourist.displayDetails();
    }
}