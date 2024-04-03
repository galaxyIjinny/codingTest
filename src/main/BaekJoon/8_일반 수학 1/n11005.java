// 17784 KB , 216 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                result.append((char) ('0' + remainder));
            } else {
                result.append((char) ('A' + remainder - 10));
            }

            N /= B;
        }

        System.out.println(result.reverse());

        scanner.close();
    }
}



// 출력은 잘 되지만 채점 시에는 런타임 에러(ArrayIndexOutOfBounds)가 발생. 맞는 풀이에 적응하도록 해야겠다

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();

        String[] number = new String[10];
        int i = 0;

        while (N > 0) {
            number[i] = Integer.toString(N % B);
            N /= B;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) { // 1m 39s
            if (B < 10) {
                System.out.print(number[j]);
            } else {
                if (Integer.parseInt(number[j]) >= 10) {
                    number[j] = String.valueOf((char)(Integer.parseInt(number[j]) + 'A' - 10));
                    System.out.print(number[j]);
                } else {
                    System.out.print(number[j]);
                }
            }
        }

       /* for (int j = i - 1; j >= 0; j--) {  // 55s. AND 연산으로 코드 길이도 줄고 시간도 빠른 듯하다.
            if (B > 10 && Integer.parseInt(number[j]) >= 10) {
                System.out.print((char) ('A' + Integer.parseInt(number[j]) - 10));
            } else {
                System.out.print(number[j]);
            }
        }*/
    }
}
