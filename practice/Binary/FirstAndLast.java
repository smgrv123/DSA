import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 2, 3, 4, 5 };
        int target = 1;
        System.out.println(Arrays.toString(firstandlast(arr, target)));
    }

    static int[] firstandlast(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean first) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}