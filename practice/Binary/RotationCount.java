public class RotationCount {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 9, 1, 2, 3, 4, 5 };
        System.out.println(count(arr));
    }

    static int count(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
