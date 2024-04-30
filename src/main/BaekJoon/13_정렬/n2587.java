// 17708 KB , 208 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += num[i];
        }

        Arrays.sort(num);

        System.out.println(sum / 5);
        System.out.println(num[2]);

        scanner.close();
    }
}
