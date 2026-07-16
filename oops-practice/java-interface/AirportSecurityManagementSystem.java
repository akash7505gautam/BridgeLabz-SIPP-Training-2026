interface LuggageScanner {
    boolean scanLuggage(double weight);

    default void displaySecurityGuidelines() {
        System.out.println("Luggage must comply with airport regulations.");
    }
}

interface PassportVerifier {
    boolean verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Passengers must carry a valid passport.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    public boolean scanLuggage(double weight) {
        return weight <= 25;
    }

    public boolean verifyPassport(String passportNo) {
        return PassportVerifier.isPassportNumberValid(passportNo);
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecurityManagementSystem {
    public static void main(String[] args) {

        String[] passengers = {"Rahul", "Priya", "Aman", "Neha"};
        String[] passports = {"A1234567", "B12345", "C7654321", "D123456"};
        double[] luggageWeights = {20, 18, 30, 22};

        AirportSecuritySystem security = new AirportSecuritySystem();

        security.displaySecurityGuidelines();
        System.out.println();

        for (int i = 0; i < passengers.length; i++) {
            boolean passportValid = security.verifyPassport(passports[i]);
            boolean luggageValid = security.scanLuggage(luggageWeights[i]);

            if (passportValid && luggageValid) {
                System.out.println(passengers[i] + " can board the flight.");
            } else {
                System.out.println(passengers[i] + " cannot board the flight.");
            }
        }
    }
}