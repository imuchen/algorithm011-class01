package Week_03;

/**
 * Created by tianguoxing on 2020/7/9 22:26.
 */
public class LC70ClimbStairs {

    /**
     * 带有缓存的递归
     * 效率很差，leetcode提交会超时
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] myCache = new int[n + 1];
        return climbStairsCache(n, myCache);
    }

    private int climbStairsCache(int n, int myCache[]) {
        if (myCache[n] > 0) {
            return myCache[n];
        }
        // terminator
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairsCache(n - 1, myCache) + climbStairsCache(n - 2, myCache);
        }

        // process current logic

        // drill down

        // restore current status

    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n > 2) {
            int f1 = 1;
            int f2 = 2;
            int f3 = 3;
            for (int i = 3; i <= n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            return f3;
        } else {
            return n;
        }
    }
}
