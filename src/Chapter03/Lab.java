package Chapter03;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lb, kg;

        System.out.printf("libra: ");
        lb = sc.nextDouble();
        kg = lb * 0.453592;
        System.out.println(kg+"kg");
//산술
        System.out.printf("kilogram: ");
        kg= sc.nextDouble();
        lb = kg * 2.204623;
        System.out.println(lb+"lb");
    }
}
