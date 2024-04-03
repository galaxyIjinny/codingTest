// 19384 KB , 316 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int Quarter = 0;
        int Dime = 0;
        int Nickel = 0;
        int Penny = 0;

        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt();
            Quarter = C / 25;
            C %= 25;
            Dime = C / 10;  // 분할 저장을 안하고 (C % 25) / 10 이런식으로 하면 19548 KB , 352 ms 이 나왔다.
            C %= 10;
            Nickel = C / 5;
            C %= 5;
            Penny = C;
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }

        scanner.close();
    }
}
