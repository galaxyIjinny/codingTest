// 14264 KB , 132 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] counting = new int[10];
        br.close();

        while (N != 0) {
            counting[N % 10]++;
            N /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                bw.write(i + "");
            }
        }

        bw.flush();
        bw.close();
    }
}
