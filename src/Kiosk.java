import java.util.Scanner;

// 메뉴 항목 클래스
class MenuItem {
    String name;
    int price;

    MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int getTotalPrice(int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " - " + price + "원";
    }
}

// 키오스크 클래스
public class Kiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuItem burger = new MenuItem("햄버거", 5000);
        MenuItem fries = new MenuItem("감자튀김", 2000);
        MenuItem coke = new MenuItem("콜라", 1500);

        int total = 0;

        while (true) {
            System.out.println("\n=== 키오스크 주문 시스템 ===");
            System.out.println("1. " + burger);
            System.out.println("2. " + fries);
            System.out.println("3. " + coke);
            System.out.println("4. 결제 진행");
            System.out.println("0. 종료 (결제 없이 종료)");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("키오스크를 종료합니다. 감사합니다.");
                break;
            }

            if (choice == 4) {
                if (total <= 0) {
                    System.out.println("주문 금액이 없습니다. 최소 한 가지는 주문해주세요.");
                    continue;
                } else {
                    System.out.println("\n결제가 완료되었습니다. 총 금액: " + total + "원");
                    System.out.println("감사합니다!");
                    break;
                }
            }

            System.out.print("수량 입력: ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("0개 이하로는 주문할 수 없습니다.");
                continue;
            }

            if (choice == 1) {
                total += burger.getTotalPrice(quantity);
            } else if (choice == 2) {
                total += fries.getTotalPrice(quantity);
            } else if (choice == 3) {
                total += coke.getTotalPrice(quantity);
            } else {
                System.out.println("올바른 번호를 입력해주세요.");
            }

            System.out.println("현재 총 금액: " + total + "원");
        }

        scanner.close();
    }
}