import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingnumber {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean val = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    val=true;
                    break;
                }
            }
            if (!val) {
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
