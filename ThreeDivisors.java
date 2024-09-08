public class ThreeDivisors {
    public static void main(String[] args) {
        int n=4;
        int div = 0;

        for (int i = 1; i <= n; i++) {
            if (div > 3) {
                System.out.println(false);

            }
            if (n % i == 0) {
                div++;
            }
        }

        if (div < 3 || div > 3) {
            System.out.println(false);
        }
        System.out.println(true);
    }
}
