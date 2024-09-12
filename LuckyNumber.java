import java.lang.reflect.Array;
import java.util.Arrays;

public class LuckyNumber {
   public static void main(String[] args) {
    int []arr={1,2,2,3,3,3};
    int lucky[]=new int[arr.length];
    int counter=0;

    int luckyNum=-1;

    for(int i=0;i<arr.length;i++){
        int num=arr[i];
        int frequency=1;

        for(int j=0;j<arr.length;j++){
            if(arr[j]==num&&i!=j){
                frequency+=1;
                // System.out.println("found");
            }
        }
// System.out.println(frequency);
        if(frequency==num){
            lucky[counter]=num;
            counter++;
        }
    }

    Arrays.sort(lucky);
    if(lucky[lucky.length-1]!=0){
        luckyNum=lucky[lucky.length-1];
    }

    System.out.println(luckyNum);
   }
}
