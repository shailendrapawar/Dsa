import java.util.Arrays;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";

        StringBuilder sb=new StringBuilder();

        int l1=word1.length();
        int l2=word2.length();

        int i=0;

        while(i<l1||i<l2){
            if(i<l1){
                sb.append(word1.charAt(i));
                
            }
            if(i<l2){
                sb.append(word2.charAt(i));
                
            }
            i++;
        }

        System.out.println(sb);
    }
}
