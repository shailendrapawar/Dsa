import java.util.Arrays;

public class RotateArray {

    static void rotate(int []nums){

        int num=nums[(nums.length)-1];

        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=num;
        return ;


    }
    public static void main(String[] args) {
        int nums[]={-1,-100,3,99};
        int k=2;
        for(int i=0;i<k;i++){
            rotate(nums);
        }
        
        System.out.println(Arrays.toString(nums));
    }
}
