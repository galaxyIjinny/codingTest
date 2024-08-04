import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) break;
            else if (str_list[i].equals("r")) {
                list.removeAll(list);
                for (int j = i; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else {
                list.add(str_list[i]);
            }
        }
        if (list.isEmpty()) return new String[0];

        return list.toArray(new String[0]);
    }
}

// 리스트에 넣으면서 오른쪽이면 버리고 다시 만들려고 했다. 그런데 arrays 사용하면 쉽게 복사해올 수 있었다.

import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[0];
    }
}

//
import java.util.Arrays;
        import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] str_list) {
        IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
    }
}

//
class Solution {
    public String[] solution(String[] str_list) {
        String[] = answer = {};

        int temp = 0;
        boolean isright = false;
        boolean isleft = false;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                temp = i;
                isleft = true;
                break;
            } else if (str_list[i].equals("r")) {
                temp = i;
                isright = true;
                break;
            }
        }

        if (isleft) {
            answer = new String[temp];

            for (int i = 0; i < temp; i++) {
                answer[i] = str_list[i];
            }
        } else if (isright) {
            answer = new String[str_list.length - temp - 1];

            for (int i = temp + 1; i < str_list.length; i++) {
                answer[i - temp - 1] = str_list[i];
            }
        }
        return answer;
    }