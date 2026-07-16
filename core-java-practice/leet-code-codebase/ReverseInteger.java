import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double ans = 0;
        while (x != 0) {
            double digit = x % 10;
            ans = (ans * 10) + digit;
            if (ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE) {
                System.out.println(0);
                return;
            }
            x /= 10;
        }
        System.out.println((int) ans);
    }
}