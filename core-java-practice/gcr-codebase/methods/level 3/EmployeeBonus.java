import java.util.*;

public class EmployeeBonus {

    public static void main(String[] args) {

        double oldSalaryTotal=0;
        double newSalaryTotal=0;
        double bonusTotal=0;

        System.out.println(
        "OldSalary\tYears\tBonus\tNewSalary");

        for(int i=1;i<=10;i++){

            int salary=
            (int)(Math.random()*90000)+10000;

            int years=
            (int)(Math.random()*10)+1;

            double bonus;

            if(years>5)
                bonus=salary*0.05;
            else
                bonus=salary*0.02;

            double newSalary=
            salary+bonus;

            oldSalaryTotal+=salary;
            newSalaryTotal+=newSalary;
            bonusTotal+=bonus;

            System.out.printf(
            "%.0f\t\t%d\t%.2f\t%.2f\n",
            (double)salary,
            years,
            bonus,
            newSalary);
        }

        System.out.println("\nTotals");
        System.out.println(
        "Old Salary = "+oldSalaryTotal);

        System.out.println(
        "Bonus = "+bonusTotal);

        System.out.println(
        "New Salary = "+newSalaryTotal);
    }
}