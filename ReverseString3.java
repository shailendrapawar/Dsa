public class ReverseString3 {
    static String  reverse(String s){

       char[] str=s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;

            i++;
            j--;
        }

        return  new String(str);

    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String []str=s.split(" ");

        String ans="";

        
        for(int i=0;i<str.length;i++){
            ans+=reverse(str[i])+" ";
            // System.out.println(reverse(str[i]));
            
        }

        System.out.println(ans);
    }
}
