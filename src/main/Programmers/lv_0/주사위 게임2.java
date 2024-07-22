class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a*a*a + b*b*b + c*c*c);
        } else if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;

        /*
        int answer = a + b + c;
        answer = answer * (a*a+b*b+c*c); 식으로 간결하게 수정 가능
        */
    }
}

//
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }

    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}

//
import java.util.Set;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());

        return (a + b + c) *
                (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
                (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
    }
}