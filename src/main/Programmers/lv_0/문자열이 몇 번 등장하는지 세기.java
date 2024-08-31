class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = myString.length() - 1; i >= 0; i--) {
            String subStr = myString.substring(0, i + 1);

            if (subStr.endsWith((pat))) {
                answer++;
            }
        }
        //
        /*for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }*/

        return answer;

        //
        int idx = myString.indexOf(pat);
        return idx == -1 ? 0 : (1 + solution(myString.substring(idx + 1), pat));
    }
}

//
import java.util.stream.Stream;

class Solution {
    public int solution(String myString, String pat) {
        return (int) Stream.iterate(0, i -> i + 1)
                .limit(myString.length() - pat.length() + 1)
                .filter(i -> myString.substring(i, i + pat.length()).equals(pat))
                .count();
        //
        return (int) IntStream.range(0,myString.length()).filter(i -> myString.substring(i).startsWith(pat)).count();
    }
}


/*
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        int idx = myString.contains(pat) ? myString.indexOf(pat) : myString.length();

        while (idx < myString.length()) {
            if (myString.substring(idx).contains(pat)) {
                idx = myString.indexOf(pat);
                answer++;
            }
            idx++;
        }
        //
        int num = 0;
        num = myString.indexOf(pat);
        while(true){

            if(num < 0){
                break;
            }else if(num >= 0){
                answer++;
                num = myString.indexOf(pat,num+1);
            }

        }

        return answer;
    }
}*/
