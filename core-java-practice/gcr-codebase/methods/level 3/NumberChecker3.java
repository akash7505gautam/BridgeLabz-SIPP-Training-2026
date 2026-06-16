import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    static int[] getDigits(int number) {

        String s = String.valueOf(number);

        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';

        return digits;
    }

    static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return rev;
    }

    static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    static boolean isPalindrome(int number) {

        int[] digits = getDigits(number);

        return compareArrays(digits, reverseArray(digits));
    }

    static boolean isDuck(int[] digits) {

        for (int digit : digits)
            if (digit == 0)
                return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Palindrome = " + isPalindrome(number));
        System.out.println("Duck = " + isDuck(digits));

        sc.close();
    }
}