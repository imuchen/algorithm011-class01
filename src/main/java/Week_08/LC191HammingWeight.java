package Week_08;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/16 22:34
 */
public class LC191HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
}
