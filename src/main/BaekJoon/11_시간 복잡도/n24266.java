// 15784 KB , 140 ms
/*
 MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
           sum <- sum + A[i] x A[j];
    return sum;
 }
 n 을 입력받아 n 까지 반복하는 행위가 세 번 중첩된다. 수행 횟수는 n * n * n 이고 시간복잡도는 O(n^2), 차수 2이다.
 3 제곱을 표현하기 위해 자료형은 최소 long 이어야 한다
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n * n * n  + "\n");
        bw.write("3" + "\n");

        bw.flush();
        bw.close();
    }
}
