import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], attendance[i]); // 어차피 조건으로 걸렀는데 idx를 저장했어야 했다......
            }
        }

        int count = 0;
        int att = 1;
        int grade = 10000;
        while (count < 3) {
            if (map.containsKey(att)) {
                for (int i = 0; i < rank.length; i++) {
                    if (rank[i] == att) {
                        answer += grade * i;
                        count++;
                        grade /= 100;
                    }
                }
            }
            att++;
        }
        return answer;

        //
        int ans = 0, cnt = 0, r = 1;
        int[] abc = new int[3];
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < rank.length; i++)
            m.put(rank[i], i);
        while (cnt < 3) {
            if (attendance[m.get(r)])
                abc[cnt++] = m.get(r);
            r++;
        }
        return abc[0] * 10000 + abc[1] * 100 + abc[2];
    }
}

//
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)  // rank 길이만큼 스트림 생성
                .filter(i -> attendence[i])  // attendance 로 필터링
                .boxed()  // stream으로 변환
                .sorted(Comparator.comparing(i -> rank[i]))  // rank 기준으로 정렬
                .limit(3L)  // 낮은 숫자 3개 선정
                .reduce((current, next) -> current * 100 + next)  // 100 곱하고 다음 항목 더하면서 차원 감소
                .get();  // int로 get
    }
}

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }
        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }