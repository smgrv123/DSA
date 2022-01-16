public class MissingNum {
    // https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i && arr[i] != arr.length) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
