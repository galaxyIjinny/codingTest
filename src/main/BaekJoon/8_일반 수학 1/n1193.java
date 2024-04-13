



// 18564 KB , 228 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int numerator;
        int denominator;
        int count = 1;

        while (X > count) { // 지그재그로 그룹을 나눌 때 X 가 속한 그룹을 찾는다
            X -= count;
            count++;
        }

        if (count % 2 == 0) { // X 가 짝수 그룹이라면
            numerator = X;
            denominator = count - X + 1;
        } else { // 홀수 그룹이라면
            numerator = count - X + 1;
            denominator = X;
        }

        System.out.println(numerator + "/" + denominator);

        scanner.close();
    }
}


/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int numerator = 1;
        int denominator = 1;
        int count = 1;

        for (int i = 1; i < X;) {

            count++;
            denominator = count;
            numerator = 1;
            i++;

            for (int j = 1; j <= count; j++) {
                if (i == X)
                    break;

                denominator--;
                numerator++;
                i++;
            }
        }

        System.out.println(numerator + "/" + denominator);

        scanner.close();
    }
}
*/
