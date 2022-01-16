import java.util.ArrayList;
import java.util.List;

public class FindAllNums {
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
    public List<Integer> findDisappearedNumbers(int[] arr) {
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
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // System.out.println(arr[index]);
                ans.add(index + 1);
            }
        }
        return ans;
    }
}
