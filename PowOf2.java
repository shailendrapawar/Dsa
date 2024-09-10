public class PowOf2 {

    static boolean check(long pow,int n){
        if(pow>n){
            return false;
        }
         if(pow==n){
            return true;
        }
        pow=pow*2;
    
        boolean val=check(pow,n);

        return val;
    }
    public static void main(String[] args) {
        int n=16;
        long pow=1;

        System.out.println(check(pow,n));
    }
}
