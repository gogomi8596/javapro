package Chapter05;

import java.util.Calendar;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class Code05_09 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("요일: " + day);
        char daych = 0;

        switch (day) {
            case 1: daych = '일';
            break;
            case 2: daych = '월';
            break;
            case 3: daych = '화';
            break;
            case 4: daych = '수';
            break;
            case 5: daych = '목';
            break;
            case 6: daych = '금';
            break;
            case 7: daych = '토';
            break;
        }
        System.out.printf("오늘은 %c요일이다.\n", daych);
    }
}
