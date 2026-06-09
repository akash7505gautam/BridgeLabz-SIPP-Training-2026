import java.util.Scanner;

public class LeetCode1_ {
    // Leetcode # 1 Palindrome Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.print(false);
            return;
        }

        int rev = 0;
        int copy = n;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        System.out.print(rev == copy);
    }
}