// 18528 KB , 244 ms . 오차 범위 조건 주어지면 타입 잘 확인하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] score = new double[N];

        double max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();

            if (max < score[i]) {
                max = score[i];
            }
            sum += score[i];
        }

        sum = sum / max * 100;

        System.out.println(sum / N);

        scanner.close();
    }
}



// 18608 KB , 252 ms .  배열 아닌 풀이

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();

            if (max < A) {
                max = A;
            }
            sum += A;
        }

        sum = sum / max * 100;
        float avg = sum / N;

        System.out.println(avg);

        scanner.close();
    }
}
