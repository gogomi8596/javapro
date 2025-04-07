package Chapter03;

import java.util.Scanner;

public class Code3_09 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        num1 += num2;
        System.out.println(num1);

        int num3 = 5;
        int result = 10 * 2 + num3++;
        System.out.println(result);
        System.out.println(num3);

        num3 = 5;
        result = 10 * 2 + ++num3;
        System.out.println(result);
        System.out.println(num3);
    }
}
