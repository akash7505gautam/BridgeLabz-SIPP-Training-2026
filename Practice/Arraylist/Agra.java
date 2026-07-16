public class Agra
{
     public int playmusic()
     {
          return 10987;

     }
     public String akash(int n)
     {
          return "Akash "+ n ;
     }
}

public class Demo
{
     public static void main(String args[])
     {
          Agra obj=new Agra();
          obj.akash(5000);
          System.out.println(obj.playmusic());
     }


}