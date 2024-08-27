class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        for (int i = 0; i < 3; i++) {
            if (date1[0] < date2[0]) {
                answer = 1;
            } else if (date1[0] == date2[0] && date1[1] < date2[1]) {
                answer = 1;
            } else if (date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) {
                answer = 1;
            } else {
                answer = 0;
            }

            //
/*            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            } else if (date1[i], date[2]) {
                answer = 0;
                break;
            }*/
        }

        return answer;

        //
/*        int date1Days = getTotalDays(date1);
        int date2Days = getTotalDays(date2);
        return date1Days < date2Days ? 1 : 0;
    }
    publicint getTotalDays(int[] date) {
        int result = 0;
        result += date[0] * 360;
        result += date[1] * 60;
        result += date[2];
        return result;
    }*/
}

//

import java.time.LocalDate;

class Solution {

    public int solution(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            return 1;
        } else {
            return 0;
        }
        //
        return LocalDate.of(date1[0], date1[1], date1[2])
                .isBefore(LocalDate.of(date2[0], date2[1], date2[2])) ? 1 : 0;
    }
}

// Java 9이상
import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }