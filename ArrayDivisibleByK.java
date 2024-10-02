public class ArrayDivisibleByK {
    public static void main(String[] args) {
        int []arr={-1,1,-2,2,-3,3,-4,4};
        int flag=arr.length/2;
        int k=3;
        int i=0;int j=(arr.length)-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum%k==0){
                flag--;
            }
            i++;
            j--;

        }
        System.out.println(flag);
        if(flag==0){
            System.out.println(true);
        }
    }
}
