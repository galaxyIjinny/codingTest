class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            switch (String.valueOf(control.charAt(i))) {
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }
        }

        //
        /*for(char ch : control.toCharArray()) {
        // 1)
        // n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
        // 2)
            switch(ch) {
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
                default:break;
            }
        }*/

        return n;
    }
}

//
class Solution {
    public int solution(int n, String control) {
        return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }
}