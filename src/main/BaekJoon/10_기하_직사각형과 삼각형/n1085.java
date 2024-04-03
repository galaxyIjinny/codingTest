// 17712 KB , 208 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int toX = x;
        int toY = y;
        // 경계까지 거리기 때문에 대각선 길이는 포함하지 않는다

        if (toX > w - x) {
            toX = w - x;
        }
        if (toY > h - y) {
            toY = h - y;
        }

        if (toX > toY) {
            System.out.println(toY);
        } else {
            System.out.println(toX);
        }

        scanner.close();
    }
}
