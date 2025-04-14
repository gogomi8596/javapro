package Chapter04;

public class Datatypetest {
    public static void main(String[] args) {

        boolean boo1 = false;
        boolean boo2 = 100 > 200;
        boolean boo3 = !boo1;

        char ch1 = 'A';
        char ch2 = 97;

        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        System.out.println("ch1+3:" + (char)(ch1 + 3));

        byte byte2 = 127;
        byte byte4 = byte2;

        System.out.println("byte2: " + byte2);
        System.out.println("byte4: " + byte4);

        short short1 = 128;
        short short2 = 127;

        int int1 = 128;
        int int2 = short1;
        int int3 = 1000000000;

        long long1 = byte2;
        long long2 = short2;
        long long3 = int1;
        long long4 = (long)Math.pow(10, 15);

        System.out.println("long4: " + long4);

        float float1 = 123.456f;
        float float2 = (float)200.123;

        double double1 = 555.456;
        double double2 = float1;
        double double3 = byte2;
        double double4 = long3;
        double double5 = 333;

        String str1 = new String("hello");
        str1 = "hello";
        String str2 = new String("hello");

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2 : " + bool4);
    }
}
