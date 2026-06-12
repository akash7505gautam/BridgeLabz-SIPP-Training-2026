import java.util.HashSet;
import java.util.Scanner;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) {
                System.out.println(true);
                break;
            }
            set.add(i);
        }
        System.out.println(false);
    }   
}