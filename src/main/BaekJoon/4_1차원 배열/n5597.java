// 17500 KB , 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = scanner.nextInt();
            students[n - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] != 1) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}
