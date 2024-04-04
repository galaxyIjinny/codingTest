// 17696 KB , 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int reward = 0;

        if (a == b && b == c) {
            reward = 10000 + a * 1000;
        } else if (a == b ||  a == c || b == c) { // 모두 같은 경우 위에서 걸러진다
            if (a == b || a == c) {
                reward = 1000 + a * 100;
            } else {
                reward = 1000 + b * 100;
            }
        } else {
            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            reward= max * 100;
        }
        System.out.println(reward);

        scanner.close();
    }
}
