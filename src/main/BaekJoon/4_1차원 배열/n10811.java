// 18492 KB , 244 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] B = new int[N + 1];
        int tmp = 0;

        for (int a = 1; a <= N; a++) {
            B[a] = a;
        }

        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            while (i <= j) {
                tmp = B[i];
                B[i] = B[j];
                B[j] = tmp;

                i++;
                j--;
            }
        }

        for (int a = 1; a <= N; a++) {
            System.out.print(B[a] + " ");
        }

        scanner.close();
    }
}
