
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt(); // 최대 경계값을 받기 위해 long 타입 사용

        System.out.println(n * 4); // 윗면의 합은 아랫면과 같기 때문에 결국 사각형 길이를 옆면, 윗면, 아랫면 합과 같다

        scanner.close();
    }
}
