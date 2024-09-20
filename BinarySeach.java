import java.util.Arrays;

public class BinarySeach {

   public  static int search(int nums[],int target){

    int s=0;
    int e=nums.length-1;

    while(s<=e){
        int mid=(s+e)/2;

        if(nums[mid]==target){
            return mid;
        }

        else if(target>nums[mid]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }

    return -1;
    }
    public static void main(String[] args) {
      int []  nums = {-1,0,3,5,9,12};
      int  target = 9;
      
      int val=search(nums,target);
      System.out.println(val);
    }
}
