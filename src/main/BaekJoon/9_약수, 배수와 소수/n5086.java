// 17740 KB , 200 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;

        do {
            A = scanner.nextInt();
            B = scanner.nextInt();

            if (A > B) {
                switch (A % B) {
                    case 0:
                        System.out.println("multiple");
                        break;
                    default:
                        System.out.println("neither");
                }
            } else if (A < B) {
                switch (B % A) {
                    case 0:
                        System.out.println("factor");
                        break;
                    default:
                        System.out.println("neither");
                }
            }
        } while (A != 0 && B != 0);

        scanner.close();
    }
}
