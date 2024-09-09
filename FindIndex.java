public class FindIndex {
    public static void main(String[] args) {
       int [] nums = {1,2,3,4,5,8,8,9,12,15};
       int target = 8;


       int l=0,r=nums.length-1;
       int mid=0;

       while(l<=r){
        mid=(l+r)/2;

        if(nums[mid]==target){
            System.out.println(mid);

        
        }
        else if(nums[mid]>target){
            r=mid-1;
        }

        else {
            l=mid+1;
        }
       }
    }
}
