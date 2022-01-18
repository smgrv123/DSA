import java.util.ArrayList;

public class StringOperations {
    public static void main(String[] args) {
        // ! will convert the char to ASCII values and add them
        System.out.println('a' + 'a');
        // ! will concatenate both the strings
        System.out.println("A" + "A");
        // ! will convert the char to string and concatenate the same
        System.out.println("a" + 'a');
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + (56));
        String ans = (56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
