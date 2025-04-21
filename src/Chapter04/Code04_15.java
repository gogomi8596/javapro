package Chapter04;

public class Code04_15 {
    public static void main(String[] args) {
        String a = "아 과제하기 싫다 과제 개";
        System.out.println(a.indexOf("과제"));
        System.out.println(a.indexOf("과제", 6));

        String b = "java";
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(1));
        System.out.println(b.charAt(2));
        System.out.println(b.charAt(3));
//        System.out.println(b.charAt(4));

        System.out.println(b.substring(1, 3));
    }
}
