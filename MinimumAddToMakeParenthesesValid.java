import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s="()))((";

        int open=0;
        int close=0;



    
        for(char ch :s.toCharArray()){
           if(ch=='('){
            open++;
           }else{
            if(open>0){
                open--;
            }else{
                close++;
            }
        }
        }

        System.out.println(open+close);

    }
}
