public class Binary {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        int target = 5;
        int res = binarySearch(arr, target);
        System.out.println(res);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == mid) {
                return mid;
            }
        }
        return -1;
    }
}