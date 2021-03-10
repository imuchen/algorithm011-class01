package sword.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: algorithm011-class01
 * @description:
 * @author: MuChen
 * @create: 2021-03-02 17:30
 **/
public class Sword03FindRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        int length = nums.length;
        if (length < 2 || length > 100000) {
            return -1;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            if(!hashSet.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 2};
        System.out.println(findRepeatNumber(nums) + "");
    }
}
