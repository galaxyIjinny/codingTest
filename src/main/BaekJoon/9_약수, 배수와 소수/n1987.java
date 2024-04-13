
// 17760 KB , 216 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }

        int prime = N; // 모두 소수라는 가정

        for (int i = 0; i < N; i++) {
            if (num[i] == 1) // 1 인 경우 제외
                prime--;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) { // 소수가 아니면 건너뛰고 개수 감소
                    prime--;
                    break;
                }
            }
        }

        System.out.println(prime);

        scanner.close();
    }
}
