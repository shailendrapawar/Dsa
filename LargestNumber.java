import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LargestNumber {

    static void add(ArrayList<Integer> list,int num){
        if(num==0){
            list.add(num);
            return;
        }
        while(num>0){
            int ld=num%10;
            list.add(ld);
            num=num/10;
        }

        return ;
        
    }
    public static void main(String[] args) {
        int nums[]={3,30,34,5,9};

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            add(list,nums[i]);
        }

        Collections.sort(list, Collections.reverseOrder());
        String result = list.toString().replaceAll("[\\[\\], ]", "");

        System.out.println(result);
    }
}
