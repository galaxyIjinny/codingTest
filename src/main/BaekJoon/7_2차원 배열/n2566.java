// 18488 KB , 252 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[9][9];
        int max = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextInt();

                // 조건을 따로 빼서 반복문 돌리는 것이 240 ms로 더 빨랐다
                if (max <= matrix[i][j]) {  // 왜인지 모르지만 '=' 를 추가해야 정답이 되었다.
                    max = matrix[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);

        scanner.close();
    }
}
