// 17768 KB , 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] measure = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                measure[i] = i;
                K--;
                if (K == 0) {  // K 번째 약수인 경우 바로 출력
                    System.out.println(measure[i]);
                }
            }
        }

        if ( K > 0) {
            System.out.println("0");
        }

        scanner.close();
    }
}
