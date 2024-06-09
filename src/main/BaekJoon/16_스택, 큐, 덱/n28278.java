// 131328 KB , 764 ms

import java.io.*;
import java.util.*;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while (N --> 0) {
            solution(br.readLine());
        }

        br.close();

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    static void solution(String query) {
        char c = query.charAt(0);

        switch (c) {
            case '1' : stack.push(Integer.parseInt(query.substring(2))); return;
            case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
        }
    }
}


// 240180 KB , 1084 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("1")) stack.push(Integer.parseInt(st.nextToken()));
            else if (command.equals("2")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                }
                else sb.append(-1).append("\n");
            }
            else if (command.equals("3")) sb.append(stack.size()).append("\n");
            else if (command.equals("4")) {
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if (command.equals("5")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.lastElement()).append("\n");
            }
        }

        br.close();

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
