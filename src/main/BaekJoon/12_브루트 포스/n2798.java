// 17740 KB , 220 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        int sum = 0;
        int jack = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N -1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > jack) {
                        jack = sum;
                    }
                }
            }
        }

        System.out.println(jack);

        scanner.close();
    }
}
