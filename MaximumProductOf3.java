import java.util.Arrays;

public class MaximumProductOf3 {

    public static void main(String[] args) {
        int nums[]={-100,-98,-1,2,3,4};
        int len=nums.length-1;
        Arrays.sort(nums);
        int p= Math.max(nums[len]*nums[len-1]*nums[len-2],nums[0]*nums[1]*nums[len]);
        System.out.println(p);
    }
}
