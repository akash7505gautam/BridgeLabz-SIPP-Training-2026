public class RaviWelcome {
    public static void main(String[] args) {
        // Ravi just joined a coding guild. Store his name, age, rank, salary, and
//       membership fee (float) using correct data types. Compute his
//       annual bonus (12% of salary), cast it to int, and print a formatted
//       welcome card.
        String Name="Nishant";
        int Age=24;
        char Rank='B';
        double Salary=20000;
        float Membership_Fee=1500.0f;
        double bonus= Salary * 0.12;
        int bonus_int=(int) Salary;
        System.out.println("#############################################");
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Rank: "+Rank);
        System.out.println("Salary: "+Salary);
        System.out.println("Membership Fee: "+Membership_Fee);
        System.out.println("Annual Bonus:"+bonus_int);
        System.out.println("#############################################");
    }
}