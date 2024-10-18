import java.util.Arrays;
import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) {
       String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[]banned = {"hit"};

        String[]st=paragraph.replaceAll(",", "").replace(".", "").split(" ");
        System.out.println(Arrays.toString(st));


        String[]str=new String[st.length];
        int i=0;
        for(String s:st){
            str[i]=s.toLowerCase();
            i++;
        }

        HashMap<String,Integer> map=new HashMap<>();

        for( String s:str){
            //banned words k liye dekhra hu
            if(map.containsKey(s)){
               int val= map.get(map);
               map.put(s, val+=1);
            }else{
                map.put(s, 1);
            }
        }
        System.out.println(Arrays.toString(str));
    }
    
}
