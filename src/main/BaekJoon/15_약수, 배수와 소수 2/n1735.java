// 16084 KB , 168 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        br.close();

        int numerator = A * D + B * C;
        int denominator = B * D;

        int mod = gcd(numerator, denominator);
        numerator /= mod;
        denominator /= mod;

        bw.write(numerator + " " + denominator + "\n");

        bw.flush();
        bw.close();
    }

    static int gcd(int A, int B) {
        if (A <= B) {
            int temp = A;
            A = B;
            B = temp;
        }

        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
