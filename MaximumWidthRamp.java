import java.util.Arrays;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        int[] nums={9,8,1,0,1,9,4,0,4,1};

        int max=0;
        int pair[]={0,0};


        for(int i=0;i<nums.length;i++){
           for(int j=nums.length-1;j>i;j--){
            if(nums[i]<=nums[j]){
                if((j-i)>max){
                    max=j-i;
                    pair[0]=j;
                    pair[1]=i;
                }
            }
           }
        }

        System.out.println(max);
        System.out.println(Arrays.toString(pair));

    }
    
}
