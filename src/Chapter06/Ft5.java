package Chapter06;

public class Ft5 {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        String oddEven = "짝";

        for (int i = 500; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(oddEven);
    }
}
