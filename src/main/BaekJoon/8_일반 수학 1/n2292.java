// 17736 KB , 212 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int range = 1; // 1번 방부터 시작해서 주변으로 6의 배수만큼 확장, 배수만큼 방의 거리
        int count = 1;

        if (N != 1) {
            while (N > range) { // N 이 범위 내에 포함될 때까지 반복이므로 범위를 넘어가면 종료하도록 한다

                range += 6 * count; // 확장된 주변 방의 마지막 번호

                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
