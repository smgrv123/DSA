public class FindInMoutainArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        int target = 2;
        System.out.println(findTarget(arr, target));
    }

    static int findMax(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            if (start == end) {
                return start;
            }
        }
        return -1;
    }

    static int findTarget(int arr[], int target) {

        int end = findMax(arr);
        System.out.println(target);
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
