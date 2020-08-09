package Week_06;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/9 21:01
 */
public class LC64MinPathSum {
    public int minPathSum(int[][] grid) {
        int length = grid[0].length;
        int[] dp = new int[length];
        dp[0] = grid[0][0];
        for (int i = 1; i < length; i++) {
            dp[i] = dp[i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < length; j++) {
                dp[j] = Math.min(dp[j - 1] + grid[i][j], dp[j] + grid[i][j]);
            }
        }
        return dp[length - 1];
    }
}
