// 17652 KB , 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] remainders = new int[42];

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int remainder = num % 42;
            remainders[remainder]++;
        }

        int count = 0;
        for (int remainder : remainders) {
            if (remainder > 0) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
