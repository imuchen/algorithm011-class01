package Week_07;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/9 21:19
 */
public class LC547FindCircleNum {
    public int findCircleNum(int[][] M) {
        boolean[] visiteds = new boolean[M.length];
        int x = 0;
        for(int i = 0; i < M.length; i++) {
            if(!visiteds[i]) {
                x++;
                dfs(M, i, visiteds);
            }
        }
        return x;
    }

    private void dfs(int[][] M, int i, boolean[] visiteds) {
        visiteds[i] = true;
        for(int j = 0; j < M.length; j++) {
            if(!visiteds[j] && M[i][j] == 1) {
                dfs(M, j, visiteds);
            }
        }
    }
}
