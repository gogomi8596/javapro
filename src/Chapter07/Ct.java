package Chapter07;

public class Ct {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setName("아이오닉");
        car1.setPrice(70000);
        car1.setProduct("현대자동자");
        car1.setCC(3000);
        car1.setYear(2025);

        car2.setName("X7");
        car2.setPrice(15000000);
        car2.setProduct("BMW");
        car2.setCC(3500);
        car2.setYear(2025);

        car3.setName("카니발");
        car3.setPrice(5000000);
        car3.setProduct("기아자동차");
        car3.setCC(5000);
        car3.setYear(2012);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.print(car1.getName()+ "자동차가");
        car1.start();
        car1.drive(60);
        car1.forward();
        car1.stop();

        System.out.print(car3.getName()+ "자동차가");
        car3.start();
        car3.drive(70);
        car3.forward();
        car3.stop();
        car3.backward();
        car3.stop();
    }
}
