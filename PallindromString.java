public class PallindromString {

    public static void main(String[] args) {
        String s="race a car";
        char [] charArr=s.replace(" ","").toLowerCase().toCharArray();
        String str="";
        for(int i=0;i<charArr.length;i++){

            char ch=charArr[i];


            if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
                str=str+ch;
            }
        }


        int i=0;
        int j=str.length()-1;
        boolean result=true;
        while(i<j){

            if(str.charAt(i)!=str.charAt(j)){
                result=false;

            }

            i++;
            j--;

        }

        System.out.println(result);

    }
}
