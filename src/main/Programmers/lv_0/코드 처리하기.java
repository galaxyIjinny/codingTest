class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i <= code.length() - 1; i++) {
            if (String.valueOf(code.charAt(i)).equals("1")) {
                if (mode == 0) mode = 1;
                else if (mode == 1) mode = 0;
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        ret.append(code.charAt(i));
                    }
                } else if (mode == 1) {
                    if (i % 2 != 0) {
                        ret.append(code.charAt(i));
                    }
                }
            }
        }

        if (ret.toString().equals("")) return "EMPTY";
        return ret.toString();
    }
}

//
class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}