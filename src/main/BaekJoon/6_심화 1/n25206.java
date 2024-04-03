
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[20];
        double totalSum = 0;
        double scoreSum = 0;
        String gradeList[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "P", "F"};
        double scoreList[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            str[i] = bfr.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * scoreList[j];
                    if (j != 8) {
                        scoreSum += score;
                    }
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.println(average);

        /*Scanner scanner = new Scanner(System.in);

        //String data[] = new String[20];
        double score = 0;
        double total = 0;
        String gradeList[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "P", "F"};
        double scoreList[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0 ; i < 20; i++) {
            String data = scanner.next();
            String[] splitData = data.split(" ");
            double degree = Double.parseDouble(splitData[1]);
            String grade = splitData[2];

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    total += degree * scoreList[j];
                    if (j != 8) {
                        score += degree;
                    }
                }
            }
        }

        double average = total / score;
        System.out.printf("%.6f", average);

        scanner.close();*/
    }
}
