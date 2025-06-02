package Chapter07;

public class Rt {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.setShape("분홍");
        rabbit1.setShape("갈색");
        rabbit1.setShape("흰색");

        rabbit1.setPosition(50, 60);
        rabbit1.setPosition(90, 100);
        rabbit1.setPosition(30, 200);

        System.out.println(rabbit1);
        System.out.println(rabbit2);
        System.out.println(rabbit3);

        rabbit1.move();
    }
}
