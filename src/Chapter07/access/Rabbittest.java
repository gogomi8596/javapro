package Chapter07.access;

public class Rabbittest {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        r1.setShape("Rectangle");
        r1.setPosition(50, 50);
        System.out.println("토끼 모양: " + r1.getShape());
        System.out.println("토끼의 현재 위치: "+"("+r1.getX()+", "+ r1.getY()+")");
    }
}
