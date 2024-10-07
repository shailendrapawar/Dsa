import java.util.Stack;

public class MinimumStringAfterRemovingSubs {

    public static void main(String[] args) {
        String s="ABFCACDB";
        Stack<Character> st=new Stack<>();

        for(char elem: s.toCharArray()){

            if(st.isEmpty()){
                st.push(elem);
                continue;
            }

            if( elem=='B'&& st.peek()=='A'){
                st.pop();
            }else if(elem=='D' &&st.peek()=='C'){
                st.pop();
            }else{
                st.push(elem);
            }

        }

        System.out.println(st.size());

    }
}
