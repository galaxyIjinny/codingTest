// 18628 KB , 256 ms

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] array = new int[N + 1]; // 실제 바구니 갯수는 양수 개부터 셈 한다.

        for (int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int a = i; i <= j; i++) {
                array[i] = k;
            }
        }

        for (int a = 1; a <= N; a++) { // 실제 출력하는 것은 첫 번째 바구니 이므로 1부터 시작
            System.out.print(array[a] + " ");
        }
    }
}
