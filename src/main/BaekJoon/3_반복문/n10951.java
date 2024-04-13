// 17884 KB , 232 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // EOF(End of File) 을 캐치해서 종료해야 한다
        while (scanner.hasNextInt()) {  // 읽을 데이터 없으면 던지는 NoSuchElementException 처리를 위해 hasNext()
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }

        scanner.close();
    }
}

// https://st-lab.tistory.com/40 참고