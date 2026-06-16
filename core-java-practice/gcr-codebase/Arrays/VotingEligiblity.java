import java.util.*;

public class VotingEligiblity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of 10 Students: ");
        int studentAge[]=new int[10];
        for(int i=0;i<10;i++){
            studentAge[i]=sc.nextInt();
        }
        for(int i=0;i<studentAge.length;i++){
            if(studentAge[i]<0){
                System.out.println("Invalid age");
            }else if(studentAge[i]>=18){
                System.out.println("The student with the age "+studentAge[i]+" can vote");
            }else{
                System.out.println("The student with the age "+studentAge[i]+" cannot vote");
            }
        }
    }
}