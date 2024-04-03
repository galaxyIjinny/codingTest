// 18436 KB , 232 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int over = (B + C) / 60;  // 단순히 생각하고 바로 반복문과 조건문을 걸었다가 시간 초과가 났다. 그래서 값 차이만 증감하는 방식을 선택

        A += over;
        B = (B + C) % 60;
        if (A >= 24) {
            A -= 24;
        }

        System.out.println(A + " " + B);

        scanner.close();
    }
}
