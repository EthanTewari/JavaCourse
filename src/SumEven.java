public class SumEven {

    int total = 0;

    private void dosum() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                total += i;

            }

        }
    }

    private void show() {
        System.out.println("even number total number in range of 1-100 is" + total);
    }

    public static void main(String[] args) {
        SumEven se = new SumEven();
        se.dosum();
        se.show();

    }
}
