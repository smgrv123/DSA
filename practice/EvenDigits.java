public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(even(nums));
    }
    static int even(int arr[]){
        int count=0;
        for (int i : arr) {
            int temp=i,check=0;
            while(temp>0){
                 temp =temp/10;
                check++;
            }
            if(check%2==0){
                count++;
            }
        }
        return count;
    }

}
