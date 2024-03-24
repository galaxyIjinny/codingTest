import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0 ; i < croatiaAlphabet.length; i++) {
            if (word.contains(croatiaAlphabet[i])) {
                // word.replace(croatiaAlphabet[i], "@");  //word 내용을 변경 x, 변경된 문자열을 반환
                word = word.replace(croatiaAlphabet[i], "@");
            }
        }

        System.out.println(word.length());

        scanner.close();
    }
}
