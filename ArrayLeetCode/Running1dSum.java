public class Running1dSum {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                res[i] = arr[i];
            } else {
                res[i] = arr[i] + res[i - 1];
            }
        }
        return res;
    }
}
