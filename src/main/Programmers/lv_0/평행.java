import java.util.ArrayList;
import java.util.List;

class Solution {
    int INF=Integer.MAX_VALUE;
    public int solution(int[][] dots) {
        return dfs(0,0,new boolean[4],dots)?1:0;
    }
    boolean dfs(int depth,int idx,boolean[] visited,int[][] dots) {
        if(depth==2) return getR(visited,true,dots)==getR(visited,false,dots);
        for(int i=idx;i<dots.length;i++) {
            if(visited[i]) continue;
            visited[i]=true;
            if(dfs(depth+1,i+1,visited,dots)) return true;
            visited[i]=false;
        }
        return false;
    }
    double getR(boolean[] visited,boolean flag,int[][] dots) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<visited.length;i++) if(visited[i]==flag) list.add(i);
        return getR(list.get(0),list.get(1),dots);
    }
    double getR(int a,int b,int[][] dots) {
        if(dots[a][0]==dots[b][0]) return INF;
        return (double)(dots[a][1]-dots[b][1])/(dots[a][0]-dots[b][0]);
    }
}