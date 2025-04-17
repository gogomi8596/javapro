import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String fc, sc, tc;
        int fs, ss, ts;
        double fcs, scs, tcs;

        System.out.print("첫번째 과목의 이름을 입력하세요: ");
        fc = a.nextLine();
        System.out.print("두번째 과목의 이름을 입력하세요: ");
        sc = a.nextLine();
        System.out.print("세번째 과목의 이름을 입력하세요: ");
        tc = a.nextLine();

        System.out.printf("%s의 이수 학점을 입력하세요: ", fc);
        fs = a.nextInt();
        System.out.printf("%s의 이수 학점을 입력하세요: ", sc);
        ss = a.nextInt();
        System.out.printf("%s의 이수 학점을 입력하세요: ", tc);
        ts = a.nextInt();

        System.out.printf("%s의 성적을 입력하세요: ", fc);
        fcs = a.nextDouble();
        System.out.printf("%s의 성적을 입력하세요: ", sc);
        scs = a.nextDouble();
        System.out.printf("%s의 성적을 입력하세요: ", tc);
        tcs = a.nextDouble();

        double avg = ((fs*fcs)+(ss*scs)+(ts*tcs))/(fs+ss+ts);

        System.out.printf("평균 학점: %.2f", avg);

        a.close();
    }
}
