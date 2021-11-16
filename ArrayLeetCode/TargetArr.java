import java.util.ArrayList;
import java.util.List;

public class TargetArr {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = res.get(i);

        return nums;
    }
}
