// 17424 KB , 208 ms

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A == 60 && B == 60 && C ==60) {
            System.out.println("Equilateral");
        } else if (A + B + C == 180 && (A == B || A == C || B == C)) {
            System.out.println("Isosceles");
        } else if (A + B + C == 180 && (A != B && B != C && A != C)) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
