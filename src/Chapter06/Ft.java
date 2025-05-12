package Chapter06;

public class Ft {
    public static void main(String[] args) {
        String[] names = {"1", "2", "3", "4", "5"};

        for (int i = 0; i < names.length; i++) {
            System.out.println( i + ": 정수캠");
        }

        for(String name: names) {
            System.out.println(name);
        }
    }
}
