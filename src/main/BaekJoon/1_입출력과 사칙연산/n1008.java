// 17960 KB , 220 ms
// float 은 오차없이 7자리, double 은 15자리. 절대 || 상대오차가 10^(-9) 이므로 double 을 사용한다

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.println(A / B);

        scanner.close();
    }
}
