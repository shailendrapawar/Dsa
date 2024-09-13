import java.util.Arrays;

public class RotateString {

    static void shift(char[] arr){

        char temp=arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        return;
    }
    public static void main(String[] args) {
        String s="abcde";
        String temp=s;
        String goal="abced";

        char sArr[]=s.toCharArray();

        do{
            shift(sArr);

            String str=new String(sArr);
            if(str.equals(goal)){
                System.out.println("true");
                break;
            }
            else if(str.equals(temp)){
                System.out.println("false");
                break;
            }
        }while(!s.equals(goal));

    }

}
