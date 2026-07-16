

import java.util.Scanner;



public class volume {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        Double vol=3.14*r*r*h;
        System.out.println(vol);
    }
    
}
