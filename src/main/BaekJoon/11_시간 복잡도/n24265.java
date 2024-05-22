// 15748 KB , 140 ms
/*
 MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1
        for j <- i + 1 to n
           sum <- sum + A[i] x A[j];
    return sum;
 }
 1 부터 n - 1 까지의 합. ((n - 1) * n) / 2 이므로  시간복잡도는 O(n^2), 차수 2이다.
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write((n * (n - 1)) / 2  + "\n");
        bw.write("2" + "\n");

        bw.flush();
        bw.close();
    }
}
