// 52080 KB , 788 ms

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> logSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String value = st.nextToken();

            if (value.equals("enter")) {
                logSet.add(name);
            } else if (value.equals("leave")) {
                logSet.remove(name);
            }
        }

        br.close();


        ArrayList<String> list = new ArrayList<String>(logSet);
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) { // 역순 정렬
            bw.write(list.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
