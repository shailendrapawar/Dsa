import java.util.Arrays;
import java.util.HashMap;

/**
 * RankTranformOfArray
 */
public class RankTranformOfArray {

    public static void main(String[] args) {
        int arr[]={37,12,28,9,100,56,80,5,12};

        int temp[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }

        Arrays.sort(temp);

        HashMap<Integer,Integer> map=new HashMap<>();

        int rank=1;

        for(int i=0;i<temp.length;i++){
            if(i>0&&temp[i]!=temp[i-1]){
                rank+=1;
            }
            map.put(temp[i], rank);
        }

        int ranks[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            ranks[i]=map.get(arr[i]);
        }

        System.out.println(Arrays.toString(ranks));

    }
}