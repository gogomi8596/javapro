package Chapter05;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("선택: ");
        String us = sc.nextLine();

        String[] hand = {"가위", "바위", "보"};
        int randomindex = (int)(Math.random() * hand.length);
        String compuhand = hand[randomindex];

        if(us.equals("가위"))
        {
            if (compuhand.equals("가위")) {
                System.out.println("비김");
            }
            else if (compuhand.equals("바위")) {
                System.out.println("짐");
            }
            else {
                System.out.println("이김");
            }
        }
        else if(us.equals("바위"))
        {
            if (compuhand.equals("가위")) {
                System.out.println("이김");
            }
            else if (compuhand.equals("바위")) {
                System.out.println("비김");
            }
            else {
                System.out.println("짐");
            }
        }
        else if(us.equals("보")){
            if (compuhand.equals("가위")) {
                System.out.println("짐");
            }
            else if (compuhand.equals("바위")) {
                System.out.println("이김");
            }
            else {
                System.out.println("비김");
            }
        }
        else {
            System.out.println("잘못 입력");
        }
        sc.close();
    }
}
