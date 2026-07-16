import java.util.Scanner;

public class LeetCode2 {
   public LeetCode2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.next();
      int var3 = 0;

      for(int var4 = 0; var4 < var2.length(); ++var4) {
         short var5 = 0;
         short var6 = 0;
         switch (var2.charAt(var4)) {
            case 'C':
               var5 = 100;
               break;
            case 'D':
               var5 = 500;
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'W':
            default:
               break;
            case 'I':
               var5 = 1;
               break;
            case 'L':
               var5 = 50;
               break;
            case 'M':
               var5 = 1000;
               break;
            case 'V':
               var5 = 5;
               break;
            case 'X':
               var5 = 10;
         }

         if (var4 < var2.length() - 1) {
            switch (var2.charAt(var4 + 1)) {
               case 'C':
                  var6 = 100;
                  break;
               case 'D':
                  var6 = 500;
               case 'E':
               case 'F':
               case 'G':
               case 'H':
               case 'J':
               case 'K':
               case 'N':
               case 'O':
               case 'P':
               case 'Q':
               case 'R':
               case 'S':
               case 'T':
               case 'U':
               case 'W':
               default:
                  break;
               case 'I':
                  var6 = 1;
                  break;
               case 'L':
                  var6 = 50;
                  break;
               case 'M':
                  var6 = 1000;
                  break;
               case 'V':
                  var6 = 5;
                  break;
               case 'X':
                  var6 = 10;
            }
         }

         if (var5 < var6) {
            var3 -= var5;
         } else {
            var3 += var5;
         }
      }

      System.out.println(var3);
   }
}