import java.util.Arrays;

public class SortColors {

   static void swap(int nums[],int i, int j){
      int temp=nums[i];
       nums[i]=nums[j];
       nums[j]=temp;

       return ;
   }
   public static void main(String[] args) {
    int nums[]={2,0,2,1,1,0};

    int index=0;
    int start=0;
    int end=nums.length-1;

    while(index<=end){
      if (nums[index]==0) {
         swap(nums,index,start);
         index++;
         start++;
      }
      else if(nums[index]==2){
         swap(nums, index, end);
         index++;
         end--;
      }else{
         index++;
      }
    }

    System.out.println(Arrays.toString(nums));
    

   } 
}
