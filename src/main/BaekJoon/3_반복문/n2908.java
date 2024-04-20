// 17568 KB , 200 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        char[] reverseA = new char[3];
        char[] reverseB = new char[3];
        int n = 0;

        for (int i = 2; i >= 0; i--) {
            reverseA[i] = A.charAt(n);
            reverseB[i] = B.charAt(n);

            n++;
        }

        String str_re_A = new String(reverseA);
        String str_re_B = new String(reverseB);

        int a = Integer.parseInt(str_re_A);
        int b = Integer.parseInt(str_re_B);

        System.out.println(a > b ? a : b);

        scanner.close();
    }
}



// 17644 KB , 208 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int reverseA = reverseNumber(A);
        int reverseB = reverseNumber(B);

        System.out.println(Math.max(reverseA, reverseB));

        scanner.close();
    }
    private static int reverseNumber(int num) {
        return (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);
    }
}
