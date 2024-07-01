// 23120 KB , 240 ms

import java.io.*;
import java.util.*;

public class Main {
    static int[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tree);
        br.close();

        int gcd = 0;

        for (int i = 0; i < N - 1; i++) {
            int distance = tree[i + 1] - tree[i];
            gcd = GCD(distance, gcd);
        }

        bw.write(((tree[N - 1] - tree[0]) / gcd + 1 - (tree.length)) + "\n");

        bw.flush();
        bw.close();
    }

    static int GCD(int a, int b) {
        if (b == 0) return a;
        else return GCD(b, a % b);
    }
}
