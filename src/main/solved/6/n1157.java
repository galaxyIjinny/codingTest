// 27886 KB, 444 ms

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        // word.toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0 ; i < word.length(); i++) {
            if (65 <= word.charAt(i) && word.charAt(i) <= 90) {  // 대문자 범위
                // ('A' <= word.charAt(i) && word.charAt(i) <= 'Z')
                alphabet[word.charAt(i) - 65]++;
                // alphabet[word.charAt(i) - 'A']++;
            } else { // 소문자 범위
                alphabet[word.charAt(i) - 97]++;
                // alphabet[word.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char same = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                same = (char) (i + 65);
            } else if (alphabet[i] == max) {
                same = '?';
            }
        }

        System.out.println(same);

        scanner.close();


        // st-lab.tistory.com/64 참고
        /*int[] arr = new int[26];

        int c = System.in.read();

        while (c > 64) { // 공백 입력받는 순간 종료
            if (c < 91) {
                arr[c - 65]++;
            } else {
                arr[c - 97]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2; // ? 는 64

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = i;
            } else if (arr[i] == max) {
                ch = -2;
            }
        }
        System.out.println((char) (ch+65));*/
    }
}
