// 17656 KB , 212 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        int sideA = b;
        int sideB = c;

        if (max < b) {
            max = b;
            sideA = a;
        }
        if (max < c) {
            if (sideA == b) {
                max = c;
                sideB = a;
            } else {
                max = c;
                sideB = b;
            }
        }

        if (max >= sideA + sideB) { // 가장 긴 막대는 최대 둘레 조건을 만족하려면 두 변의 길이 합보다 1 작아야 한다
            System.out.println(sideA + sideB + (sideA + sideB - 1));
        } else {
            System.out.println(max + sideA + sideB);
        }
    }
}
