import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers here: ");
        int numberInput[]=new int[5];
        for(int i=0;i<numberInput.length;i++){
            numberInput[i]=sc.nextInt();
        }
        for(int i=0;i<numberInput.length;i++){
            if(numberInput[i]==0){
                System.out.println("Number is 0");
            }else if(numberInput[i]<0){
                System.out.println("The number "+numberInput[i]+" is negative");
            }else{
                if(numberInput[i]%2==0){
                    System.out.println("The number "+numberInput[i]+" is positive and even");
                }else{
                    
                    System.out.println("The number "+numberInput[i]+" is positive and odd");
                }
            }
        }
    }   
}