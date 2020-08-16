package Week_08;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/16 22:41
 */
public class LC231IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
