// 17688 KB , 224 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            sum += primeNum(i);
            if (min == 0) {
                min = primeNum(i);
            }
        }

        if (min == 0) {
            sum = -1;
            System.out.println(sum);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        scanner.close();
    }

    public static int primeNum (int num) {
        if (num <= 1) {  // 1일 경우도 빼먹지 말기
            return 0;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }
}
