// 18524 KB , 248 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] ball = new int[N + 1];

        for (int a = 0; a <= N; a++) {
            ball[a] = a;
        }

        for (int c = 1; c <= M; c++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int a = 1; a <= N; a++) {
            System.out.print(ball[a] + " ");
        }

        scanner.close();
    }
}
