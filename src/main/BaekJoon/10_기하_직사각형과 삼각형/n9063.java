// 103824 KB , 980 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0 ; i < N; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();
        }

        int minX = X[0];
        int minY = Y[0];
        int maxX = X[0];
        int maxY = Y[0];

        for (int i = 1; i < N; i++) {
            if (minX > X[i]) minX = X[i];
            if (maxX < X[i]) maxX = X[i];
            if (minY > Y[i]) minY = Y[i];
            if (maxY < Y[i]) maxY = Y[i];
        }

        System.out.println((maxX - minX) * (maxY - minY));

        scanner.close();
    }
}
