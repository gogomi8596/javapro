package Chapter06;

import java.util.Scanner;

public class Wt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0 , n2 = 0;
        int s = 0;

        while (true) {
            System.out.println("enter a number");
            n1 = sc.nextInt();
            System.out.println("enter a number");
            n2 = sc.nextInt();

            s = n1 + n2;
            System.out.printf("%d, %d, %d", n1, n2, s);
        }
    }
}
