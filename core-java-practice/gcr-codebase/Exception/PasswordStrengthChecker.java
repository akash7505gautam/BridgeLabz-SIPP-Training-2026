public class PasswordStrengthChecker {

    public static void checkPassword(String password) {

        try {
            if (password == null) {
                throw new NullPointerException("Password cannot be null.");
            }

            if (password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty.");
            }

            if (password.length() < 8) {
                throw new IllegalArgumentException(
                        "Password must be at least 8 characters long.");
            }

            if (!Character.isUpperCase(password.charAt(0))) {
                throw new IllegalArgumentException(
                        "First character must be uppercase.");
            }

            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                throw new IllegalArgumentException(
                        "Last character must be a digit.");
            }

            boolean special = false;
            String specialChars = "@#$%&*";

            for (int i = 0; i < password.length(); i++) {
                if (specialChars.indexOf(password.charAt(i)) != -1) {
                    special = true;
                    break;
                }
            }

            if (!special) {
                throw new IllegalArgumentException(
                        "Password must contain at least one special character (@,#,$,%,&,*).");
            }

            System.out.println("Strong Password!");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        checkPassword(null);
        checkPassword("");
        checkPassword("Pass1");
        checkPassword("password@1");
        checkPassword("Password@A");
        checkPassword("Password1");
        checkPassword("Password@1");
    }
}