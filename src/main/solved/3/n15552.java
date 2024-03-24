// 300332 KB , 1076 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String data = br.readLine();
            int A = Integer.parseInt(data.split(" ")[0]);
            int B = Integer.parseInt(data.split(" ")[1]);

            bw.write(A+B+"\n");
        }
        bw.flush();
    }
}
