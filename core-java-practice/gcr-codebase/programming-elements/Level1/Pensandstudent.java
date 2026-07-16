import java.util.*;
class Pensandstudent
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pens = sc.nextInt();
        int students =sc.nextInt();

        int penPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + penPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}