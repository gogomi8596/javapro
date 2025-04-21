package Chapter05;

import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.print("홀짝: ");
        int n = ss.nextInt();

        if (n%2==0){
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
    }
}
