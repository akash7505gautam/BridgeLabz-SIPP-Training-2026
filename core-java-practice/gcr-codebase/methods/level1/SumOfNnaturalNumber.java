import java.util.Scanner;

public class SumOfNnaturalNumber {
    public static int printSum(int number){
        if(number<=0){
            return 0;
        }
        return number*(number+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(printSum(number));
    }
}