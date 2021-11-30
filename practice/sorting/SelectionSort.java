import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 2, 5, 6 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[maxIndex] = temp;
        }
    }
}
