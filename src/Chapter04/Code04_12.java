package Chapter04;

import java.util.Scanner;

public class Code04_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        System.out.print("입력: ");
        a = sc.nextLine();

        a=a.toUpperCase();
        System.out.println(a);
        a=a.toLowerCase();
        System.out.println(a);

        String tr = a.trim();
        System.out.println(tr);
    }
}
