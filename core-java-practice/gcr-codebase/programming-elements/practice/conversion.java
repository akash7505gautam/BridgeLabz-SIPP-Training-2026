import java.util.Scanner;

public class conversion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double temprature=sc.nextDouble();
        double converted_temprature=(temprature * 9/5)+ 32;
        System.out.print(converted_temprature);
        
    }    
}
