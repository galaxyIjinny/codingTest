// 19360 KB , 240 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            int[] measure = new int[n];
            int max = 0;
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    measure[i] = i;
                    max = measure[i];
                    sum += measure[i];
                }
            }

            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 1; i < n; i++) {
                    if (measure[i] != 0) {
                        System.out.print(measure[i]);

                        if (measure[i] == max) {
                            System.out.println();
                            break;
                        }

                        System.out.print(" + ");
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }
        scanner.close();
    }
}
