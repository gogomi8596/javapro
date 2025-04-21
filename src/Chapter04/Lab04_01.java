package Chapter04;

public class Lab04_01 {
    public static void main(String[] args) {
        String a = "블랙핑크";
        System.out.println("원본 문자열: "+a);

        System.out.print("로꾸거: ");
        for (int i = a.length()-1; i >=0; i--) {
            System.out.print(a.charAt(i));

        }
        System.out.printf("\n");

        String b = "Java";
        System.out.println(b);
        String c = "";

        c = b.substring(0, 1).toLowerCase();
        c += b.substring(1, 2).toUpperCase();
        c += b.substring(2, 3).toLowerCase();
        c += b.substring(3, 4).toUpperCase();

        System.out.print(c);
    }
}
