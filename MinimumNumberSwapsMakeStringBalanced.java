import java.util.Stack;

public class MinimumNumberSwapsMakeStringBalanced {
  public static void main(String[] args) {
    String s="]]][[[";

    Stack<Character> st=new Stack<>();


    int count=0;
    for(char ch:s.toCharArray()){
        if(ch=='['){
            st.push(ch);
        }else{
            if(!st.isEmpty()){
                st.pop();
            }else{
              count+=1;
            }
        }
    }

    if(count%2==0){
        System.out.println(count);
    }else{
        System.out.println((count+1)/2);
    }

    
    
  }  
}
