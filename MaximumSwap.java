import java.util.Arrays;

public class MaximumSwap {
   public static void main(String[] args) {
    int num=2736;
    char[] numArr=Integer.toString(num).toCharArray();
    int len=numArr.length;

    //taking variables
    char maxElement=numArr[len-1];

    int maxIndex=len-1;
     int swapIdx1=-1;
     int swapIdx2=-1;

     for(int i=len-2;i>=0;i--){

        if(numArr[i]>maxElement){
            maxElement=numArr[i];
            maxIndex=i;
        }else if(numArr[i]<maxElement){
            swapIdx1=i;
            swapIdx2=maxIndex;
        }

     }

     if(swapIdx1!=-1){
        char temp=numArr[swapIdx1];
        numArr[swapIdx1]=numArr[swapIdx2];
        numArr[swapIdx2]=temp;
     }
     System.out.println(Arrays.toString(numArr));
   } 
}
