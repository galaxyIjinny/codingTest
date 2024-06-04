// 363876 KB , 2548 ms

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        bw.write(sb + "\n");

/*  338280 KB , 1652 ms . Counting 정렬 방식

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }

        bw.write(sb.toString());
        */

        bw.flush();
        bw.close();
    }
}
