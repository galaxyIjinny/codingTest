// 17692 KB , 208 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int day = ((V - A) / (A - B)) + 1;  // 올라가는 행위가 먼저이므로

        if ((V - A) % (A - B) > 0) {
            System.out.println(day + 1);
        } else {
            System.out.println(day);
        }

        //
        int day = (V - B) / (A - B);

        if ((V - A) % (A - B) > 0) {
            day++;
        }
        System.out.println(day);
        //
    }
}
