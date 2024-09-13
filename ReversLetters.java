import java.util.Arrays;

public class ReversLetters {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        char []str=s.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<j){
            char ch1=str[i];
            char ch2=str[j];


            if(!((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z'))){
                i++;
                
            }

            else if(!((ch2>='a'&&ch2<='z')||(ch2>='A'&&ch2<='Z'))){
                j--;
                
            }

            else{
               char t= str[i];
               str[i]=str[j];
               str[j]=t;

               i++;
               j--;
            }
            
            
            
        }

        System.out.println(new String(str));

    }
}
