import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Arrays.sort(nums);
        boolean res=true;

        int len=nums.length-1;;

        for(int i=0;i<len-1;i++){

            if(!(nums[i]*2<=nums[len])){
                res=false;
                break;

            }

        }

        System.out.println(res);

    }
}
