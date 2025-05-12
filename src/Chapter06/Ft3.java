package Chapter06;

public class Ft3 {
    public static void main(String[] args) {
        int fact = 1;
        int count = 5;

        for (int i = 0; i <= count; i++){
            fact *= i;
        }

        System.out.println(count + "경우의 수는" + fact);
    }
}
