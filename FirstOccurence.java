public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            char ch=haystack.charAt(i);
            if(ch==needle.charAt(0)){

                String sub=haystack.substring(i, needle.length()+i);
                System.out.println(sub);
                if(sub.equals(needle)){
                    System.out.println(i);
                    
                }
                

            }
        }

        System.out.println("-1");
    }
}
