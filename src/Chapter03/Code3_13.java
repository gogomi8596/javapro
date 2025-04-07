package Chapter03;

import java.util.Scanner;

public class Code3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;

        System.out.print("당신의 점수: ");
        s = sc.nextInt();

        if  (s >= 70) {
            System.out.println("당신의 점수는 "+s+"점, 합격입니다. **70점 이상 합격**");
        }
        else {
            System.out.println("당신의 점수는 "+s+"점, 불합격입니다. **70점 이상 합격**");
        }

        sc.close();
    }
}
