// 244416 KB , 240 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int sum = 0;
        for (int o : stack) {
            sum += o;
        }

        // 배열로 직접 구현. 23728 KB , 204 ms
        int top = -1;

        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                top--;
            } else {
                top++;
                arr[top] = number;
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }

        bw.write(sum + "\n");

        br.close();

        bw.flush();
        bw.close();
    }
}
