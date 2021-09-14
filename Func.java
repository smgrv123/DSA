import java.util.Scanner;

public class Func{
    public static void main (String[] args){
        sum();
    }

    static void sum(){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=num1+num2;
        System.out.println("The sum of two numbers is"+num3);
    }
}