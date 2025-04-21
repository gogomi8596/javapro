package Chapter05;

import java.util.Scanner;

public class Code05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        int s = sc.nextInt();
        String result = "";

        if (s >= 98) {
            result = "A";
        }
        else if (s >= 88) {
            result = "B";
        }
        else if (s >= 78) {
            result = "C";
        }
        else if (s >= 68) {
            result = "D";
        }
        else {
            result = "F";
        }
        System.out.printf("%d점은 %s학점", s, result);
    }
}
