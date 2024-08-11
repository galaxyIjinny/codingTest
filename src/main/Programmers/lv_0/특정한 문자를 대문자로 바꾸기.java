class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i ++) {
            if (alp.equals(String.valueOf(my_string.charAt(i)))) {
                sb.append(alp.toUpperCase());
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
        // return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
