import java.util.Scanner;

public class NumberOfStepsTorReduceANumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int step_count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            step_count++;
        }
        System.out.println(step_count);
    }
}