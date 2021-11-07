public class ArrayMin {
    public static void main(String[] args) {
        int arr[]={3,1,41,68,8,6,43,96};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minimum=Integer.MAX_VALUE;
        for (int i : arr) {
            if(i<minimum){
                minimum=i;
            }
        }
        return minimum;
    }
}
