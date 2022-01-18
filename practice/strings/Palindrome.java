import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if (start != end) {
                System.out.println('n');
            }
        }
        System.out.println('y');
    }
}