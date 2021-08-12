public class SumPrime {
    public static void main(String[] args) {
        int i, n, count, sum = 0;

        for (n = 1; n <= 2000; n++) {
            count = 0;
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0 && n != 1) {
                sum = sum + n;
            }
        }
        System.out.println("\n sum of Prime no from 1 to 2000 is " + sum);
    }
}
