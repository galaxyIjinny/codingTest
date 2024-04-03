// 17796 KB , 220 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int checker = number;

        for (int i = 0 ; i < number; i++) {
            String word = scanner.next();
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) != word.charAt(j+1)) {
                    String check = word.substring(j+1);
                    if (check.contains(String.valueOf(word.charAt(j)))) {
                        checker--;
                        break;
                    }
                }
            }
        }

        System.out.println(checker);

        scanner.close();
    }
}
