// 17572 KB , 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int square = 1;

        for (int i = 0; i < N; i++) { // 사각형이 분할되는 개수를 세고
            square *= 2;
        }
        int dot = (square + 1) * (square + 1); // 점은 그보다 하나 더 많고 그것을 제곱

        System.out.println(dot);
    }
}
