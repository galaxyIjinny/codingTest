// 18268 KB , 228 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] position = new int[26];

        for (int i = 0; i < 26; i++) {
            position[i] = -1;
        }

        String S = scanner.next();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';

            if (position[index] == -1) {
                position[index] = i;
            }
        }

        for (int a : position) {
            System.out.println(a + " ");
        }

        scanner.close();
    }
}
