class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String checkS2 : s2) {
            for (String checkS1 : s1) {
                if (checkS2.equals(checkS1))
                    answer++;
            }
        }

        return answer;
    }
}

//
import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int) Arrays.stream(s2).filter(set::contains).count();

        //
        int answer = 0;
        List<String> stringList = Arrays.stream(s1).collect(Collectors.toList());

        for (String string : s2) {
            if (stringList.contains(string)) answer++;
        }
        return answer;
    }
}

//
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).amp(s -> Arrays.stream(s2)
                        .collect(Collectors.toList())
                        .contains(s))
                .filter(b -> b)
                .count();
    }

    //
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list1 = Arrays.asList(s1);
        List<String> list2 = Arrays.asList(s2);

        list1 = list1.stream().filter(one -> list2.stream().filter(
                two -> two.contentEquals(one)
        ).findAny().isPresent()).collect(Collectors.toList());

        return list1.size();
    }
}