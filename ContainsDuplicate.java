import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        Arrays.sort(nums);
       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
        System.out.println("contains duplicate");
        break;
        }else{
            map.put(nums[i],1);
        }
       }
    }
}
