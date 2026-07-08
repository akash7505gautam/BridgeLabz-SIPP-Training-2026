import java.util.*;

public class EmployeeAttendanceRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = employeeIds[i];
            arr[i][1] = attendance[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }
}