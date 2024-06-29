// 29240 KB , 320 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }
        for (int i = 0; i < M; i++) { // 듣도 보도 못한 사람이 겹치면 value를 2로 수정, 없으면 value 1
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1); // 찾는 키가 맵에 있으면 찾는 키의 값 반환, 없으면 기본값
            if (map.get(name) == 2) list.add(name);
        }

        br.close();

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size() + "\n");

        for (String s : list) {
            sb.append(s + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
