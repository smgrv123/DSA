import java.util.Scanner;

public class ques3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int principle=in.nextInt();
        int rate=in.nextInt();
        int time=in.nextInt();
        int simpleInterest=(principle*rate*time)/100;
        System.out.println("Simple Interest is "+simpleInterest);
    }
}