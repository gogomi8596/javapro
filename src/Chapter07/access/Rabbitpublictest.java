package Chapter07.access;

public class Rabbitpublictest {
    public static void main(String[] args) {
        RabbitPublic r1 = new Rabbitpublic();
        r1.shape = "Circle";
        r1.x = 70;
        r1.y = 50;

        System.out.println(r1.shape + r1.x + r1.y);
    }
}
