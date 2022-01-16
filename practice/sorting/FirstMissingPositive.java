public class FirstMissingPositive {
    // https://leetcode.com/problems/first-missing-positive/submissions/
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }
}
