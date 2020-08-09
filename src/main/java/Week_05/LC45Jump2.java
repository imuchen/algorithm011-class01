package Week_05;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/7/26 18:48
 */
public class LC45Jump2 {
    public int jump(int[] nums) {
        int steps = 0;
        int maxPosition = 0;
        int curJumpMaxP = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == curJumpMaxP) {
                curJumpMaxP = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
