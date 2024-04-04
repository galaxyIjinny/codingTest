// 18336 KB , 356 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) { // j = 0 부터 시작 보다 거꾸로가 코드 짧고 메모리도 조금 덜 들었다
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
