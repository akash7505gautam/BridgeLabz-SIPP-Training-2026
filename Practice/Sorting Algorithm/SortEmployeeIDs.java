import java.util.Scanner;

public class SortEmployeeIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] empId = new int[n];
        for (int i = 0; i < n; i++) {
            empId[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int key = empId[i];
            int j = i - 1;

            while (j >= 0 && empId[j] > key) {
                empId[j + 1] = empId[j];
                j--;
            }

            empId[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(empId[i] + " ");
        }
    }
}