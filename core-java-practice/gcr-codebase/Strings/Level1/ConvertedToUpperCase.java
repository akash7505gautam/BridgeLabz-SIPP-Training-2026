import java.util.Scanner;

public class ConvertedToUpperCase{
    static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ch = (char)(ch - 32);
            result += ch;
        }
        return result;
    }
    static boolean compare(String a, String b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String user = toUpper(text);
        String builtIn = text.toUpperCase();
        System.out.println(user);
        System.out.println(builtIn);
        System.out.println(compare(user, builtIn));
    }
}