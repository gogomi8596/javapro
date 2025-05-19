package Chapter06;

public class Di {
    public static void main(String[] args) {
        int c = 0;
        int d = 0, d2=0, d3=0;

        while (true) {
            c++;

            d = (int)(Math.random()*6 +1);
            d2 = (int)(Math.random()*6 +1);
            d3 = (int)(Math.random()*6 +1);

            if(d==d2 && d2==d3){
                break;
            }
            System.out.printf("%d", c);
        }
    }
}
