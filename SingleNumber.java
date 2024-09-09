import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]={2,2,1};

        Arrays.sort(nums);


        for(int i=0;i<nums.length;i+=2){
            if(i!=i+1){
                return i;
            }

        }
        
    
    }
    
}
