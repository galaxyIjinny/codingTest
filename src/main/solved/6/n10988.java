// 메모리 : 17652 KB , 시간 : 192 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        boolean palindrome = true;

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
