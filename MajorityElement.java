public class MajorityElement {

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};

        int limit=nums.length/2;

        for(int i=0;i<nums.length;i++){
            int freq=0;

            for(int j=0;j<nums.length;j++){
           

                if(nums[i]==nums[j]){
                    freq++;
                }
            }

            if(freq>=limit){
                System.out.println(nums[i]);
                break;  
            }
        }
        
    }
}
