import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height[]=new double[11];
        double sum_of_height=0;
        System.out.println("Enter the heights of team players");
        for(int i=0;i<height.length;i++){
            System.out.print("Enter the height of palyer "+(i+1)+": ");
            height[i]=sc.nextDouble();
        }
        for(int i=0;i<height.length;i++){
            sum_of_height+=height[i];
        }
        double mean=sum_of_height/height.length;
        System.out.println("Mean height of players is: "+mean);
    }
}