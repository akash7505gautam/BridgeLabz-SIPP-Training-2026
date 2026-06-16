import java.util.Arrays;
import java.util.Scanner;

public class SpyAgencyProblem {
    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }
    static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    static char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println("Reversed Message: " + reverse(message));
        if (isPalindrome(message)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }
        countVowelsConsonants(message);
        String intercept1 = sc.nextLine();
        String intercept2 = sc.nextLine();
        if (isAnagram(intercept1, intercept2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }
        String log = sc.nextLine();
        char result = firstNonRepeating(log);
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}