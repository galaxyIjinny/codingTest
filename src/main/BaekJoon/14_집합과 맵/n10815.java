// 319280 KB , 4712 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] NArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        NArray = new int[N];

        for (int i = 0; i< N; i++) {
            NArray[i] = scanner.nextInt();
        }

        Arrays.sort(NArray);

        int M = scanner.nextInt();
        int[] MArray = new int[M];
        for (int i = 0; i < M; i++) {
            MArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            System.out.print(binarySearch(MArray[i]) + " ");
        }

        scanner.close();
    }

    public static int binarySearch(int index) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = NArray[middle];

            if (index > middleValue) {
                left = middle + 1;
            } else if (index < middleValue) {
                right = middle - 1;
            } else
                return 1;
        }
        return 0;
    }
}
