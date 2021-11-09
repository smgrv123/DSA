public class MaxWealth{
    public static void main( String[] args ) {
        int [][] wealth={
            {1,2,3,4},
            {9,8,7},
            {11,4,15,45}
        };
        System.out.println(maxWealth(wealth));
    }
    static int maxWealth(int [][] arr){
        int max=Integer.MIN_VALUE,check;
        for (int[] is : arr) {
            check=0;
            for (int is2 : is) {
                check+=is2;
            }
            if(check>max){
                max=check;
            }
        }
        return max;
    }
}