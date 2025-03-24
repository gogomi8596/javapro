package chap2;

public class Caf {
    public static void main(String[] args) {
        int num1 = 20, num2 = 10;
        int resAdd;
        int resSub;
        int resMul;
        int resDiv;

        resAdd = num1 + num2;
        resSub = num1 - num2;
        resMul = num1 * num2;
        resDiv = num1 / num2;

        System.out.println(num1 + "+" + num2 + "=" + resAdd);
        System.out.println(num1 + "-" + num2 + "=" + resSub);
        System.out.println(num1 + "*" + num2 + "=" + resMul);
        System.out.println(num1 + "/" + num2 + "=" + resDiv);
    }
}
