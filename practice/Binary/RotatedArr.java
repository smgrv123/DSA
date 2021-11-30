public class RotatedArr {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 9, 1, 2, 3, 4, 5 };
        int target = 5;
        System.out.println(pivot(arr));
        System.out.println(FindTarget(arr, target));
    }

    static int pivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    static int FindTarget(int arr[], int target) {
        int pivot = pivot(arr);
        int first = binarySearch(arr, target, 0, pivot - 1);
        if (first != -1) {
            return first;
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
