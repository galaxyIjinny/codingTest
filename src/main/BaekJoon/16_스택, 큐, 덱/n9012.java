// 14460 KB , 132 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        br.close();
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            else if (stack.empty()) {  // 닫는 괄호를 입력받았으나 pop할 워노가 없을 경우
                return "NO";
            } else {  // 그 외 닫는 괄호인 경우
                stack.pop();
            }
        }

        if (stack.empty()) {  // 스택이 비어야 온전히 괄호가 닫힌 경우
            return "YES";
        } else {
            return "NO";
        }
    }
}
