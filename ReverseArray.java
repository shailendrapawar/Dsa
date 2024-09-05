import java.util.Arrays;

class ReverseArray {

  static void reverse(int i,int j, int[]arr){

    if(i==j){
      return;
    }
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    reverse(i+1, j-1, arr);
    return;
  }


  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int f=0;
    int r=arr.length-1;
    reverse(f,r,arr);
    System.out.println(Arrays.toString(arr));

  }
}