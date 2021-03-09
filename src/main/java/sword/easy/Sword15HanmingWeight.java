package sword.easy;

/**
 * Created by tianguoxing on 2021/3/8 17:16.
 */
public class Sword15HanmingWeight {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int cnt = 0;
            while (n != 0) {
                n &= (n - 1);
                cnt++;
            }
            return cnt;
        }
    }
}
