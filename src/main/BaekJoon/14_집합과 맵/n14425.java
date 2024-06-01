// 32292KB , 2876 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] S = new String[N];
        String[] search = new String[M];

        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            search[i] = br.readLine();
        }

        br.close();

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                if (search[i].equals(S[j])) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}
