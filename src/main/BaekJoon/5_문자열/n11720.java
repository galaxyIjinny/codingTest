// 17688 KB , 208 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;

        String s = scanner.next();

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            // sum += s.charAt(i) - '0';  // 또는 - 48
            // 이렇게 아스키코드 값을 바로 변환할 수도 있다. 17752 KB , 204 ms
        }

        System.out.println(sum);

        scanner.close();
    }
}
