package Chapter03;

public class Lab02 {
    public static void main(String[] args) {
        int s = 0;
        int b = 0;

        s += 1800 * 2;//바나나맛 우유 판매
        s += 4000 * 4;//도시락 판매
        s += 1500;//콜라 판매
        s += 2000 * 4;//새우깡 판매
        s += 1800 * 5;//캔커피 판매

        System.out.println("판매액: +" +s);

        b += 900 * 10; //삼각 김밥 구입
        b += 3500 * 5; //도시락 구입

        System.out.println("구매액: -"+b);

        System.out.println("매출액: +"+(s-b));
    }
}
