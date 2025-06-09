package Chapter07;

public class Lab02 {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        int count = 0;

        while (true){
            count++;
            d1.setnum((int)(Math.random()*6+1));
            d2.setnum((int)(Math.random()*6+1));
            d3.setnum((int)(Math.random()*6+1));

            if(d1.getnum() == d2.getnum() && d1.getnum() == d3.getnum()){
                break;
            }

            System.out.println(d1.getnum()+", "+d2.getnum()+", "+d3.getnum());
            System.out.println(count);
        }
    }
}
