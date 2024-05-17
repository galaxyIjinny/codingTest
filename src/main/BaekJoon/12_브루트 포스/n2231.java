// 17856 KB , 260 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < N; i++) {
            sum = 0;
            int num = i;
            for (int j = 1; j < i; j *= 10) {
                sum += i % (j * 10) / j;
            }

            sum += num;
            if (N == sum) {
                System.out.println(num);
                break;
            }
        }

        if (N != sum) {
            System.out.println("0");
        }

        scanner.close();
    }
}
