// 31160 KB , 532 ms

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(st.countTokens());

        scanner.close();
    }
}



// 14216 KB , 152 ms
// 원시 입력 형태로 문자 하나씩 읽어서 문자가 공백인지 아닌지 판단하여 단어 세기
// st-lab.tistory.com/65

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int blank = 32; // 공백을 의미, 이전 문자 저장
        int str; // 현재 입력받은 문자 저장

        while (true) {
            str = System.in.read();

            if (str == 32) { // 입력 문자가 공백일 때
                if (blank != 32) // 이전 문자가공백이 아니면
                    count++;
            } else if (str == 10) { // 입력 문자가 개행일 때
                if (blank != 32)
                    count++;
                break;;
            }

            blank = str;
        }

        System.out.println(count);
    }
}
