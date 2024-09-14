import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={0,1};
        Arrays.sort(nums);
    

        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                System.out.println("missing is "+i);
                break;
            }
        }

    }
}
