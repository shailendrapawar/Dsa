import java.util.Arrays;

public class FindGCDofArray {

    public static void main(String[] args) {
        int nums[]={2,5,6,9,10};

        Arrays.sort(nums);
        int min=Math.min(nums[0], nums[nums.length-1]);
        int max=Math.max(nums[0], nums[nums.length-1]);
        if(max%min==0){
            System.out.println(min);;
        }
        int gcd=1;
        for(int i=1;i<min;i++){
            if(min%i==0&&max%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

    }
}
