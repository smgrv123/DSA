public class RangeSearch {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,4,5,6};
        int target,start,end;
        start=1;end=5;target=4;
        System.out.println(range(arr, start, end, target));
    }
    static int range(int arr[], int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
