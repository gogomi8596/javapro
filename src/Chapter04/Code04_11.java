package Chapter04;

import java.util.Scanner;

public class Code04_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var1, var2;
        int diff;

        System.out.print("첫 번재 문자열: ");
        var1 = sc.nextLine();
        System.out.print("두 번째 문자열: ");
        var2 = sc.nextLine();

        diff=var1.length()-var2.length();
        System.out.printf("두 문자열 길이의 차이는 %d입니다.", diff);
        sc.close();
    }
}
