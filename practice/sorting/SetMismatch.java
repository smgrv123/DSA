public class SetMismatch {
// https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        // List<Integer> ans=ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] - 1 != index) {
                // System.out.println(arr[index]);
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { arr[arr.length], arr.length };
    }
}
