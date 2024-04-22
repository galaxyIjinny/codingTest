// 17724 KB , 204 ms
/*
 enOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <= sum + A[i];
    return sum;
 }
 n 을 입력받아 n 까지 반복. n 이 커질수록 n 만큼 증가하여 O(n) 시간 걸린다
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n);
        System.out.println(1);

        scanner.close();
    }
}
