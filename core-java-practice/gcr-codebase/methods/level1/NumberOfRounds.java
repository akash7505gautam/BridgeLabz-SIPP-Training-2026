import java.util.Scanner;

public class NumberOfRounds {
    public static double numberofrounds(double side1,double side2,double side3){
        double perimeterOfground = side1+side2+side3;
        return 5000/perimeterOfground;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        double  rounds= numberofrounds(side1,side2,side3);
        System.out.println("The Athelete needs to complete "+ rounds +" rounds to complete 5 KM run");
    }
}
