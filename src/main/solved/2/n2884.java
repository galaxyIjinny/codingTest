// 메모리 : 18520 KB , 시간 : 236 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute =scanner.nextInt();

        if (minute < 45) {
            hour--;
            minute = minute + 15;
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);

        }  else {
            System.out.println(hour + " " + (minute-45));
        }
        scanner.close();
    }
}
