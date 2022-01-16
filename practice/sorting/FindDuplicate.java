public class FindDuplicate {
    // https://github.com/smgrv123/DSA-Bootcamp-Java/blob/main/lectures/11-sorting/code/src/com/kunal/FindDuplicate.java
    public int findDuplicate(int[] arr) {
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
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] - 1 != index) {
                // System.out.println(arr[index]);
                return arr[index];
            }
        }
        return arr[arr.length];
    }
}
