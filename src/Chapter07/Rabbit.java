package Chapter07;

public class Rabbit {
    private String shape;
    private int x;
    private int y;

    public Rabbit(){
        shape = "기본";
        x = 30;
        y = 30;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        System.out.println("토끼가" + x + y + "로 이동");
    }
}
