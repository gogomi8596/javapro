package Chapter03;

import java.util.Scanner;

public class Prac01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double we, he;

        System.out.print("enter your weight: ");
        we = s.nextDouble();

        System.out.print("enter your height: ");
        he = Math.pow(s.nextDouble() / 100, 2);

        double result = we / he;

        System.out.println("your BMI is: "+result);

        s.close();
    }
}
