public class ReverseVowelString {

    public static boolean check(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "hello";

        char str[]=s.toCharArray();

        int start=0;
        int end=str.length-1;

        while(start<end){
            if(!check(str[start])){
                start++;
            }
            else if(!check(str[end])){
                end--;
            }

            else{
                char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
            }
        }

        System.out.println(new String(str));
    }
}
