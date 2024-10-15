public class SeparateBall {
    public static void main(String[] args) {
        String s="101";
        
        int n=s.length();
        int last=0;

        long swapCount=0;

        for(int curr=0;curr<n;curr++){

            if(s.charAt(curr)=='0'){
                swapCount+=(curr-last);
                last++;
            }
        }

        System.out.println(swapCount);

    }
}
