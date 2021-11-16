import java.util.ArrayList;

public class Candies {
    public static void main(String[] args) {

    }

    static ArrayList<Boolean> kidsWithCandies(int[] arr, int n) {
        ArrayList<Boolean> res=new ArrayList<Boolean>();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+n>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}


