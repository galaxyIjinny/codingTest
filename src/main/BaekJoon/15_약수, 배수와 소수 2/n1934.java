
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int D = gcd(A, B);
            sb.append(A * B / D).append("\n");
        }

        br.close();

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            // GCD(a, b) = GCD(b, r) 이므로 변환
            a = b;
            b = r;
        }
        return a;
    }
}
