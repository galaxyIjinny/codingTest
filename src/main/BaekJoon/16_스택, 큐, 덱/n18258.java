// 350756 KB , 1444 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer command;

        while(N-- > 0) {
            command = new StringTokenizer(br.readLine(), " ");

            switch (command.nextToken()) {
                case "push":
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    Integer item = q.poll();
                    if (item == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(item).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer ite = q.peek();
                    if (ite == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(ite).append("\n");
                    }
                    break;
                case "back":
                    Integer it = q.peekLast();
                    if (it == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(it).append("\n");
                    }
                    break;
            }
        }

        br.close();

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}
