import java.util.Scanner;
public class MultiplesOfNumberUsingForLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number; i < 100; i += number) {
            System.out.print(i + " ");
        }
    }
}