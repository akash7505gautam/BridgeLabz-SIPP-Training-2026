import java.util.HashSet;

class EventEntryVerification {

    HashSet<String> participants = new HashSet<>();

    // Register Participant
    void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " already registered! Duplicate entry rejected.");
        }
    }

    // Display Participants
    void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Attendees: " + participants.size());
    }
}

public class EventDemo {
    public static void main(String[] args) {

        EventEntryVerification event = new EventEntryVerification();

        event.registerParticipant("aman@gmail.com");
        event.registerParticipant("riya@gmail.com");
        event.registerParticipant("karan@gmail.com");

        // Duplicate Registration
        event.registerParticipant("aman@gmail.com");

        event.displayParticipants();
    }
}