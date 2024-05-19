// 19644 KB , 228 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        /*for (int i = -999; i <= 999; i++) {  // 일일이 대입해서 찾는 방법
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c) {
                    if (d * i + e * j == f) {
                        bw.write(i + " " + j + "\n");
                        break;
                    }
                }
            }
        }*/

        // 가감법 사용(일반적인 연립방정식 푸는 방법). 16220 KB , 148 ms
        int y = (d * c - a * f) / (d * b - e * a);
        int x = (e * c - b * f) / (e * a - d * b);
        bw.write(x + " " + y + "\n");

        bw.flush();
        bw.close();
    }
}


// 정상 출력은 되지만 채점 시 런타임 에러(by zero). 속도의 문제보다는 구한 y 값을 사용하면 a = 0 이 되면 에러 발생 가능

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int y = (d * c - a * f) / (d * b - e * a);
        int x = (c - b * y) / a;

        System.out.print(x + " " + y);

        scanner.close();
    }
}
