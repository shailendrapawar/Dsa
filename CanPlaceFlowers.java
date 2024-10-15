public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,1};
        int n=2;

        for(int i=0;i<flowerbed.length;i++){
            if(i!=0&&i!=flowerbed.length-1){
            if(flowerbed[i]==0&& flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }}
        }
        System.out.println(n);
        if(n==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
