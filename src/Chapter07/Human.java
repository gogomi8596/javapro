package Chapter07;

public class Human {
    String name;
    int age;

    public void walk(String place) {
        System.out.println("Human Walk in " + name + place);
    }
    public void eat(String food) {
        System.out.println("Human Eat " + name + food);
    }
}
