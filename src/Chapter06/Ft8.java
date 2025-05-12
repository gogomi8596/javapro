package Chapter06;

public class Ft8 {
    public static void main(String[] args) {
        String[][] tn = {{"이승만", "윤보선", "박정희", "최규하", "전두환"}, {"김영삼", "김대중", "노무현", "이명박", "박근혜"}};
        for (int i = 0; i < tn.length; i++) {
            System.out.print(i + 1 + "팀: ");
            for (int j = 0; j <tn[i].length; j++) {
                System.out.printf("%s\t", tn[i][j]);
                if ((j+1) % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
