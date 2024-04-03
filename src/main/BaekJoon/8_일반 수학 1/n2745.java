// 17760 KB , 212 ms . 대신 코드 길이가 665 B 로 더 짧음

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.next();
        int num = scanner.nextInt();

        int tmp = 1;
        int sum = 0;

        for (int i = data.length() - 1; i >= 0; i--) {
            char c = data.charAt(i);

            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * tmp;
            } else {
                sum += (c - '0') * tmp;
            }
            tmp *= num;
        }

        System.out.println(sum);

        scanner.close();
    }
}



// 17760 KB , 212 ms

import java.io.IOException;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.next();
        int num = scanner.nextInt();

        int decimal = 0;

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0';
            } else {
                digit = c - 'A' + 10;
            }
            //int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10; // 17780 KB , 216 ms
            decimal = decimal * num + digit;
        }

        System.out.println(decimal);

        scanner.close();
    }
}



/*
// 실행 시에는 정상 작동하지만, 문제가 원하는 방법은 아스키 코드를 이용하는 것
// 배열을 미리 선언함으로 복잡해지고, 메모리도 잡아먹으며 출제 의도를 만족할 수 없었다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.next();
        int num = scanner.nextInt();

        int ten = 0;

        String[] capital = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int[] over = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35 };

        if (num < 10) {
            for (int i = 0; i < data.length(); i++) {
                int temp = 1;
                for (int j = data.length() - 1; j > i; j--){ // 자릿수
                    temp *= num;
                }
                ten += Character.getNumericValue(data.charAt(i)) * temp; // 계수 곱
            }
        } else if (num <= 36) {
            for (int i = 0; i < data.length(); i++) {
                int temp = 1;
                for (int j = data.length() - 1; j > i; j--) {
                    temp *= num;
                }
                for (int c = 0; c < 26; c++) {
                    if (Character.toString(data.charAt(i)).equals(capital[c])) {
                        ten += over[c] * temp;
                    }
                }
            }
        }

        System.out.println(ten);

        scanner.close();
    }
}
*/