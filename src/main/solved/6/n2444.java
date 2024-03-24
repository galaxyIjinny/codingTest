// 메모리 : 23464 KB , 시간 : 536 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int layer = (n - i); layer > 0; layer--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (n - 1); i >= 1; i--) {
            for (int layer = 1; layer <= (n - i); layer++) {
                System.out.print(" ");
            }
            for (int star = (i * 2 - 1); star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
