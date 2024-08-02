class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string.substring(0, s));

        StringBuilder rv = new StringBuilder();
        rv.append(my_string.substring(s, e + 1));
        rv.reverse();
        sb.append(rv);

        sb.append(my_string.substring(e + 1, my_string.length()));

        return sb.toString();
    }
}

//

class Solution {
    public String solution(String my_string, int s, int e) {

        char[] arr = my_string.toCharArray();
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        return new String(arr);
    }
}