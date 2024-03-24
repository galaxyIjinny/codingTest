// 메모리 : 17648 KB , 시간 : 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String word[] = new String[T];

        for (int i = 0; i < T; i++) {
            String testCase = scanner.next();
            word[i] = testCase.substring(0, 1) + testCase.substring(testCase.length() - 1, testCase.length());
            System.out.println(word[i]);
        }

        scanner.close();
    }
}
