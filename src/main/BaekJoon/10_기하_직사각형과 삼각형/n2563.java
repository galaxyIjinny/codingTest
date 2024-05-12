// 18020 KB , 224 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] paper = new int[100][100];

        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();  // 좌표를 paper[x][y] 로 받으려고 했는데 겹치는 부분을 계속 계산해줘야 하는 문제가 있었따
            int y = scanner.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
