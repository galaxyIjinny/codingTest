// 메모리 : 17804 KB , 시간 : 224 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int kind = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < kind; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            sum += price * count;
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
