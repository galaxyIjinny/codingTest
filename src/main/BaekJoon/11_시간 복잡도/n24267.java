// 15676 KB , 140 ms
/*
 MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
               sum <- sum + A[i] x A[j] x A[k];
    return sum;
 }
 크기 순으로 중복되지 않게 뽑는 경우의 수와 같다. 즉 조합을 구하는 방식이 수행 횟수이다.
 n 개의 수 중 3 개를 뽑으므로 nC3 = ((n * (n - 1) * (n - 2)) / 3! 이고, 시간복잡도는 O(n^3), 차수 3이다.
 3 제곱을 표현하기 위해 자료형은 최소 long 이어야 한다
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(((n * (n - 1) * (n - 2)) / 6)  + "\n" + 3);

        bw.flush();
        bw.close();
    }
}
