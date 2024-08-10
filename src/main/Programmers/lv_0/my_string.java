class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder(rny_string.replace("m","rn"));
        //
        /*for (char c : rny_string.toCharArray()) {
            sb.append(c == 'm' ? "rn" : c);
        }*/
        return sb.toString();
        //return rn_string.replaceAll("m","rn");
    }
}
