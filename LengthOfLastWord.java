import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] sArr=s.split(" ");
        int size=sArr.length;

        String word=sArr[size-1];
        System.out.println(word.length());
 
    }
}
