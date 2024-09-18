public class GoatLatin {

    static String solve(String s,int index){

        char ch=s.charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            s=s+="ma";
        }else{
            s=s.substring(1);
            s=s+ch;
            s=s+"ma";
        }

        for(int i=0;i<index+1;i++){
            s=s+"a";
        }


        return s;
    }
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";

        String arr[]=sentence.split(" ");

        String str="";
        for(int i=0;i<arr.length;i++){

            String word=arr[i];
            String s=solve(word,i);
            arr[i]=s;
            if(i!=0){
                str+=" "+arr[i];
            }else{
                str+=arr[i];
            }
            
        }

        

        System.out.println(str);
        
    }
}
