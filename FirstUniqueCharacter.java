public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s="aabb";

        int first=-1;


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean flag=true;

            for(int j=0;j<s.length();j++){
                if(j==i){
                    continue;
                }
                char ch2=s.charAt(j);
                if(ch==ch2){
                    flag=false;
                    break;
                }
                
            }
            if(flag){
                System.out.println("unique"+i);
                first=i;
                return;
            }
        }
        System.out.println(first);
    }
}
