public class FaultyKeyboard {

    static String reverse(String s){
        char[]str=s.toCharArray();
        int i=0;
        int j=str.length-1;

        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;j--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String s="poiinter";
        String val="";

        char[] str=s.toCharArray();

        for(int i=0;i<str.length;i++){
            char ch=str[i];

            if(ch=='i'){
                val=reverse(val);
            }else{
                val=val+str[i];
            }
        }

        System.out.println(val);
    }
}
