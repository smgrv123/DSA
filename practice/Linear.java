import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter size");
        int size=in.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target");
        int target=in.nextInt();
        int res=LinearSearch(arr, target);
        switch(res) {
            case 0:
                System.out.println("Target doesnt exist");
                break;
            case -1:
                System.out.println("Array length is 0");
            default:
                System.out.println(res);
                break;
        }
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // ! this for loop iterates through the entire array and return index of element
        // ? here because index is being return edge and corner cases can return -1 as index of the array will never be negative
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==target){
        //         return i;
        //     }
        // }

        // ! this for each loop returns the element of the array
        // ? here the element can be negative therefore this function is best used will bool as return type
        // * change this function and code to bool 
        for (int i : arr) {
            if(i==target){
                return i;
            }
        }
        return 0;
    }
}
