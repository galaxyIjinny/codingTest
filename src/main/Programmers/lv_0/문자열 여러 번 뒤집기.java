class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb;
        String answer = my_string;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            sb = new StringBuilder();
            sb.append(answer.substring(0, s));

            StringBuilder rvs = new StringBuilder();
            rvs.append(answer.substring(s, e + 1));
            rvs.reverse();

            sb.append(rvs);
            sb.append(answer.substring(e + 1, answer.length()));
            answer = sb.toString();
        }

        return answer;
    }
}

class Soludtion {
    static StringBuilder rvr(StringBuilder s, int l, int r) {
        StringBuilder t = new StringBuilder(s.substring(l, r + 1));
        t.reverse();
        s.replace(l, r + 1, t.toString());
        return s;
    }

    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int[] q : queries) answer = rvr(answer, q[0], q[1]);
        return answer.toString();
    }
}


//
class Solution {

    char[] arr;

    public String solution(String my_string, int[][] queries) {
        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }
        return new String(arr);
    }

    privatevoid reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}

//
class Solution {
    public String solution(String myString, int[][] queries) {
        for (int[] arr : queries) {
            myString = myString.substring(0, arr[0])
                    + new StringBuilder(myString.substring(arr[0], arr[1] + 1)).reverse().toString()
                    + myString.substring(arr[1] + 1);
        }
        return myString;
    }
}