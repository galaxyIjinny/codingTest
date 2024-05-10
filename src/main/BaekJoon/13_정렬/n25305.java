
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i< N; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores);

        System.out.println(scores[N - k]);

        scanner.close();
    }
}
