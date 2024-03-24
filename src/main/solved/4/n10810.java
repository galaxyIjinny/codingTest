// 18628 KB , 256 ms

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] array = new int[N + 1];

        for (int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int a = i; i <= j; i++) {
                array[i] = k;
            }
        }

        for (int a = 1; a <= N; a++) {
            System.out.print(array[a] + " ");
        }
    }
}
