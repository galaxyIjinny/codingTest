// 17752 KB , 240 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int num = 0;
        while (num != 1) {
            num = factorization(N);
            N /= num;

            if (num != 1) {
                System.out.println(num);
            }
        }
        /*for (int i = 1; i < N; i++) {
            num = factorization(N);
            N /= num;

            if (num == 1) break;
            System.out.println(num);  // 이 경우 72 의 마지막 소인수가 출력 안됨
        }*/

        scanner.close();
    }

    public static int factorization (int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0)
                return i;
        }
        return 1;
    }
}
