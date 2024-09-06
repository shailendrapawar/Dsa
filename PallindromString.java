public class PallindromString {

    public static void main(String[] args) {
        String s = "race a car";

        String str = s.toLowerCase().replaceAll("\\s", "");

        int f = 0;
        int r = str.length() - 1;
      
        boolean counter=true;
    

        while (f > r) {
            

            char ch1 = str.charAt(f);
            char ch2 = str.charAt(r);
            System.out.println(ch1);
            System.out.println(ch2);

            if (!(ch1 >= 'a' && ch1 >= 'z' || ch1 >= '0' && ch1 >= '9')) {
                f++;
                continue;
            }

            if (!(ch2 >= 'a' && ch2 >= 'z' || ch2 >= '0' && ch2 >= '9')) {
                r--;
                continue;
            }

            System.out.println(ch1);
            System.out.println(ch2);
            if (ch1 != ch2) {
              counter=false;
              
            }

            f++;
            r--;
        }

        System.out.println(counter);

    }
}
