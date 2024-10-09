import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String s="()[]{}";

        Stack<Character> st=new Stack<>();
        for( char ch :s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    if(ch==')'){
                        if(st.peek()=='('){
                            st.pop();
                        }else{
                            System.out.println(false);
                        }
                    }
                     if (ch=='}') {
                        if(st.peek()=='{'){
                            st.pop();
                        }else{
                            System.out.println(false);
                        }
                    }
                    if(ch==']') {
                        if(st.peek()=='['){
                            st.pop();
                        }else{
                            System.out.println(false);
                        }
                    }
                }
            }
        }

        if(st.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
