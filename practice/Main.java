import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        switch(n){
            case 1:
                System.out.println(n);
                break;
            default:
                System.out.println("no");
        }
    }
}