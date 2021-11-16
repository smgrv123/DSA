public class ShuffleArr {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] arr, int n) {
        int[] res = new int[arr.length];
        for (int i = 0; i < n; i++) {
            res[i * 2] = arr[i];
            res[(i * 2) + 1] = arr[i + n];
        }
        return res;
    }
}
