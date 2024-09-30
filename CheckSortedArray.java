public class CheckSortedArray {

    static int check(int []nums){
        int count=0;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            if(nums[i]>nums[(i+1)%n]){
             count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
      
        int count=check(nums);
        System.out.println(count);

    }
}
