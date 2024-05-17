// 17636 KB , 212 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            int max = a;
            int side1 = b;
            int side2 = c;

            if (max < b) {
                max = b;
                side1 = a;
            }
            if (max < c) {
                max = c;
                if (side1 == a) side2 = b;
                else side2 = a;
            }

            if (max >= side1 + side2) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        scanner.close();
    }
}
