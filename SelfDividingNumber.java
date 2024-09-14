import java.util.ArrayList;

public class SelfDividingNumber {

    public static boolean check(int n){
        boolean res=true;
        if(n<10){
            return true;
        }
        else{
            int temp=n;

            while(n>0){
                int ld=n%10;
                if(ld==0){
                    return false;
                }
                if(temp%ld!=0){
                    return false;
                }
                n=n/10;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int left=0,right=22;

        ArrayList<Integer> list =new ArrayList<>();

        for(int i=left;i<=right;i++){
            boolean val=check(i);
            if(val){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
