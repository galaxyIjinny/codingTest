// 15848 KB , 148 ms
/*
 MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
           sum <- sum + A[i] x A[j];
    return sum;
 }
 n 을 입력받아 n 까지 반복하는 행위 중첩해서 두 번. 따라서 수행 횟수는 n * n 인 n^2 이고 시간복잡도는 O(n^2), 차수 2이다.
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n * n + "\n");
        bw.write("2" + "\n");

        bw.flush();
        bw.close();
    }
}
