package Chapter06;

import java.util.Scanner;

public class Com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = 0;
        int my = 0;
        com = (int)(Math.random()*5 + 1);

        my = sc.nextInt();

        if (com == my) {
        }
        else {
        }
        sc.close();
    }
}
