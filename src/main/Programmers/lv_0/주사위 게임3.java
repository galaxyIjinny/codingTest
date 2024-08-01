import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        HashMap<Integer, Integer> dice = new HashMap<>();
        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
        //map.put(a, map.get(a) + 1); 1~6 기본 0으로 세팅하고 시작했는데 불필요했다.

        List<Integer> keys = new ArrayList<>(dice.keySet());

        switch(dice.size()) {
            case 1:
                return 1111 * a;
            case 2:
                if (dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) { // 1개, 3개
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int) Math.pow(10 * p + q, 2);
                } else { // 2개, 2개
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
            case 3: //2개, 1개 1개
                int result = 0;
                for (Integer key : dice.keySet()) {
                    if (dice.get(key) != 2) {
                        if (result == 0) {
                            result = key;
                        } else {
                            return result * key;
                        }
                    }
                }
            case 4:
                Collections.sort(keys);
                return keys.get(0);
        }

        return answer;

        //
        if (map.size() == 1) return 1111 * a;
        if (map.szie() == 2) {
            if (map.containsValue(3)) {
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return answer * answer;
            }
            int x = (a + b + c + d - 2 * a) / 2;
            return (a + x) * Math.abs(a - x);
        }
        if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> el : map.entrySet())
                if (el.getValue() != 2) answer - el.getKy();
            return answer;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}

//
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        int answer = 0;

        if (dice[0] == dice[3]) {
            answer = 111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == d[1] && dice[2] ==dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }

        return answer;
    }
}

import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : new int[] {a, b, c, d}) {
            if (map.containsKey(data)) map.put(data, map.get(data) + 1)
            else map.put(data, 1);
        }

        PriorityQueue<Dice> pq = new PriorityQueue<>();
        for (int key : map.keySet())
            pq.add(new Dice(key, map.get(key)));

        int answer = 0;
        if (pq.size() == 1) answer = pq.poll().number * 1111;
        else if (pq.size() == 3) {
            pq.poll();
            answer = pq.poll().number * pq.poll().number;
        } else if (pq.size() == 4) {
            pq.poll(); pq.poll(); pq.poll();
            answer = pq.poll().number;
        } else {
            Dice maxDice = pq.poll();
            Dice next = pq.poll();
            if (maxDice.count == 3) {
                answer = (10 * maxDice.number + next.number) * (10 * maxDice.number + next.number);
            } else {
                answer = (maxDice.number + next.number) * ((int)(Math.abs(maxDice.number - next.number)));
            }
        }
        return answer;
    }

    public class Dice implements Comparable<Dice> {
        int number;
        int count;

        public Dice(int number, int count) {
            this.number = number;
            this.count = count;
        }

        @Override
        public int compareTo(Dice o) {
            if (this.count == o.count)
                return o.number - this.number;
            return o.count - this.count;
        }
    }
}

// 하드 코딩해야하면 차라리 함수 분리라도
class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b==c && c==d) {
            return 1111 * a;
        }
        if(a==b && b==c) {
            return triple(a,d);
        }
        if(a==b && b==d){
            return triple(a,c);
        }
        if(b==c && c==d) {
            return triple(b,a);
        }
        if(a==c && c==d) {
            return triple(a,b);
        }
        if(a==b && c==d) {
            return double1(a,c);
        }
        if(a==c && b==d) {
            return double1(a,b);
        }
        if(a==d && b==c) {
            return double1(a,b);
        }
        if(a==b)
            return double2(c,d);
        if(a==c)
            return double2(b,d);
        if(a==d)
            return double2(b,c);
        if(b==c)
            return double2(a,d);
        if(b==d)
            return double2(a,c);
        if(c==d)
            return double2(a,b);
        return Math.min(Math.min(a,b), Math.min(c,d));
    }

    private int double2(int q, int r) {
        return q * r;
    }

    private int double1(int p, int q) {
        return (p+q) * Math.abs(p-q);
    }

    private int triple(int p, int q) {
        return (10 * p + q) * (10 * p + q);
    }
}