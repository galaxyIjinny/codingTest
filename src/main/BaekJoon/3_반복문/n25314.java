// 메모리 : 17656 KB , 시간 : 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < (n/4); i++) {
            System.out.print("long ");
        }
        System.out.print("int");
        scanner.close();
    }
}
