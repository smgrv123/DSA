public class SmallerNums {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i] && i != j) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
