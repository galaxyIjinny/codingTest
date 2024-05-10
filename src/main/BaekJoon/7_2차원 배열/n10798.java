// 17744 KB , 208 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[5];

        for (int i = 0; i< 5; i++) {
            lines[i] = scanner.nextLine();
        }

        int length = 0;
        for (String line : lines) {
            if (line.length() > length) {
                length = line.length();
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines[j].length()) {
                    result.append(lines[j].charAt(i));
                }
            }
        }

        System.out.println(result.toString());

        scanner.close();
    }
}
