public class MaxConsecutive {
    public static void main(String[] args) {
        int[] nums = { 1,0,1,1,0,1 };

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int streak = 0;

                for (int j = i; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        streak++;
                    } else {
                        break;
                    }
                }

                if(streak>max){
                    max=streak;
                }
            }
            
        }
        System.out.println(max);

    }

}