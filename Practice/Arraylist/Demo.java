class Calculator
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
}



public class Demo
{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int a=obj.add(10,20);
        System.out.println(a);

        
        
        
    }
}