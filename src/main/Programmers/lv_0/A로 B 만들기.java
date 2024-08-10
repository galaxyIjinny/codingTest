class Solution {
    public int solution(String before, String after) {
        // (1)
        if (before.length() != after.length()) return 0;
        else {
            Map<String, Integer> beforeMap = new HashMap<>();
            Map<String, Integer> afterMap = new HashMap<>();
            for (int i = 0; i < before.length(); i++) {
                beforeMap.getOrDefault(before[i], 0) + 1;
                afterMap.getOrDefault(after[i], 0) + 1;
            }

            for (int j = 0; j < beforeMap.size(); j++) {
                if (beforeMap.get(beforeMap.keySet().)) // key만 어떻게 대입할지에서 막힘
            }

            return answer;
        }
        // (2) 정렬 잘못 사용
        if (before.length() != after.length()) return 0;
        else {
            Arrays.sort(before.toCharArray());
            Arrays.sort(after.toCharArray());

            if (before.equals(after)) return 1;
            else return 0;

        }
        //
        /*char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return new String(a).equals(new String(b)) ? 1 : 0;*/

        // (3)
        int answer = 0;
        if (before.length() != after.length()) answer = 0;
        else {
            String[] beforeArr = new String[before.length()];
            String[] afterArr = new String[before.length()];
            for (int i = 0; i < before.length(); i++) {
                beforeArr[i] = before.charAt(i) + "";
                afterArr[i] = after.charAt(i) + "";
            }
            Arrays.sort(beforeArr);
            Arrays.sort(afterArr);

            for (int j = 0; j < beforeArr.length; j++) {
                String beforeSort = beforeArr[j];
                String afterSort = afterArr[j];

                if (!beforeSort.equals(afterSort)) {
                    answer = 0;
                    break;
                }
                else answer = 1;
            }
        }
        return answer;
    }
}

//

class Solution {
    public int solution(String before, String after) {
        for (int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(before.substring(i, i + 1), "");
        }
        return after.length() == 0 ? 1 : 0;
    }
}

//
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        return isCheck(getList(before), getList(after)) ? 1 : 0;
    }

    private boolean isCheck(List<Integer> first, List<Integer> second) {
        for (int i = 0; i < first.sie(); i++) {
            if (first.get(i) != second.get(i)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> getList(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s))
                .values()
                .stream()
                .map(List::size)
                .collect(Collectors.toList());
    }
}