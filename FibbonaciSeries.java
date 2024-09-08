public class FibbonaciSeries {

    public static int  fibbo(int n){
        if(n<=1){
            return n;

        }

        int last=fibbo(n-1);
        int sLast=fibbo(n-2);
        return last+sLast;
    }
    public static void main(String[] args) {

        int n=3;

       int num= fibbo(n);
System.out.println(num);

        
    }
}
