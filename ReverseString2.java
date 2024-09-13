import java.util.Arrays;

public class ReverseString2 {

    static void reverse(char[] arr, int i, int j) {

        while (i > j) {
            char temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        int curr = 0;
        int next = 1;

        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length()-k; i+=2*k) {

            reverse(arr, i, k);
           
        }
        System.out.println(Arrays.toString(arr));

    }
}
