import java.util.Arrays;

public class RotateArrayOptimal {

    static void reverse(int s,int e, int[] nums){

        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;

            s++;
            e--;
        }

        return ;

    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        int k=3;

        reverse(0,k-1,nums);
        System.out.println(Arrays.toString(nums));

        reverse(k+1, nums.length-1, nums);
        System.out.println(Arrays.toString(nums));

        reverse(0, nums.length-1, nums);
        System.out.println(Arrays.toString(nums));
    }
}
