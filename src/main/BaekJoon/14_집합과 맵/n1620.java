// 58508 KB , 548 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // 시간 단축을 위해 2가지 해시맵 사용
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<String, Integer> hash2 = new HashMap<String, Integer>();

        for (int i = 1; i <= N; i++) {
            String S = br.readLine();
            hash1.put(i, S);
            hash2.put(S, i);
        }

        for (int i = 0; i < M; i++) {
            String S = br.readLine();

            if (49 <= S.charAt(0) && S.charAt(0) <= 57) {
                sb.append(hash1.get(Integer.parseInt(S))).append("\n");
            } else {
                sb.append(hash2.get(S)).append("\n");
            }
        }

        br.close();

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
