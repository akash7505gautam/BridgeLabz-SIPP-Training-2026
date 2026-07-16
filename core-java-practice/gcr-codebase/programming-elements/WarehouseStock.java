import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class WarehouseStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_qty = sc.nextInt();
        int quantities[] = new int[total_qty];
        for (int i = 0; i < total_qty; i++) {
            quantities[i] = sc.nextInt();
        }
        Arrays.sort(quantities);
        System.out.println("Max Stock: " + quantities[total_qty - 1]);
        System.out.println("Min Stock: " + quantities[0]);
        int total_stock = 0;
        for (int i : quantities) {
            total_stock += i;
        }
        System.out.println("Total Stock of Warehouse is: " + total_stock);
        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;
        System.out.print("Duplicate Items: ");
        for (int num : quantities) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                duplicate = true;
            }
            set.add(num);
        }
        if (!duplicate) {
            System.out.print("No Duplicates");
        }
        System.out.println();
        int k = sc.nextInt();
        k = k % total_qty;
        int[] rotated = new int[total_qty];

        for (int i = 0; i < total_qty; i++) {
            rotated[(i + k) % total_qty] = quantities[i];
        }
        System.out.print("Rotated Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] shelf = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }
    }
}