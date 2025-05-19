package Chapter07;

public class Ht {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.name = "Human 1";
        human1.age = 20;

        human2.name = "Human 2";
        human2.age = 21;

        human1.walk("학생식당");
        human1.eat("가라아게");

        human2.walk("식당");
        human2.walk("짜장면");
    }
}
