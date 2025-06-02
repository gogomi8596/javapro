package Chapter07;

public class Car {

    private String name;
    private String product;
    int price;
    int year;
    int cc;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setProduct(String product){
        this.product = product;
    }

    public String getProduct(){
        return product;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setCC(int cc){
        this.cc = cc;
    }

    public int getCC(){
        return cc;
    }

    public void start(){
        System.out.println("시작");
    }

    public void drive(int speed){
        System.out.println("시속 "+speed);
    }

    public void forward(){
        System.out.println("전진");
    }

    public void backward(){
        System.out.println("후진");
    }

    public void stop(){
        System.out.println("정지");
    }
}
