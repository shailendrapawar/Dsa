import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String []s = {"h","e","l","l","o"};

        System.out.println(Arrays.toString(s));
        int i=0;
        int j=s.length-1;
        // int len=s.length;
        
        while(i<j){
            String temp="";
            temp+=s[i];
            s[i]=s[j];

            s[j]=temp;
            i++;
            j--;

        }

        System.out.println(Arrays.toString(s));
    }
}
