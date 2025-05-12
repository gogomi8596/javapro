package Chapter06;

public class Ft7 {
    public static void main(String[] args) {
        int guone = 0;
        int gutwo = 0;

        for (guone = 2; guone < 10; guone++){
            for (gutwo = 1 ; gutwo < 10; gutwo++){
                System.out.printf("%d x %d = %d\t", guone, gutwo, guone*gutwo);
                if (gutwo == 9) {
                    System.out.printf("\n\n");
                }
            }
        }
    }
}
