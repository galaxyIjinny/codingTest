// 17580 KB , 200 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int ascii = (int) s.charAt(0);

        System.out.println(ascii);

        scanner.close();
    }
}
