package Chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int bd = sc.nextInt();

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        int age = year - bd;
        String res = "";

        if(age >= 18) {
            res = "ㅎㅎ ㅈㅅ";
        }
        else {
            res = "나가";
        }
        System.out.print(res);
        sc.close();
    }
}
