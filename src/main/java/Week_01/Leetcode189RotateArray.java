package Week_01;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/6/27 19:03
 */
public class Leetcode189RotateArray {
    /**
     * 1. 将nums反转
     * 2. 将nums前k%nums.length个元素反转
     * 3. 将nums后nums.length-k%nums.length个元素反转
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if (k > 0) {
//            nums = _reverse(nums, true, nums.length);
//            nums = _reverse(nums, true, k % nums.length);
//            nums = _reverse(nums, false, nums.length - k % nums.length);
            nums = reverse(nums, 0, nums.length - 1);
            nums = reverse(nums, 0, k % nums.length - 1);
            nums = reverse(nums, k % nums.length, nums.length - 1);
        }
    }

    /**
     * 反转数组前k或后k个元素
     *
     * @param nums
     * @param fromBeginning 是否从头开始，是则反转前k个元素，否则反转后k个元素
     * @param k
     * @return
     */
    private static int[] _reverse(int[] nums, boolean fromBeginning, int k) {
        if (null != nums && nums.length >= 1 && k > 0) {
            if (fromBeginning) {
                int tmp = 0;
                for (int i = 0; i < k / 2; i++) {
                    tmp = nums[i];
                    nums[i] = nums[(k - 1) - i];
                    nums[(k - 1) - i] = tmp;
                }
            } else {
                int tmp = 0;
                for (int i = nums.length - k; i < (nums.length - k) + k / 2; i++) {
                    tmp = nums[i];
                    nums[i] = nums[(nums.length - 1) + (nums.length - k) - i];
                    nums[(nums.length - 1) + (nums.length - k) - i] = tmp;
                }
            }
        }
        return nums;
    }

    /**
     * 反转数组指定区间的元素
     * @param nums
     * @param start 开始索引
     * @param end 结束索引
     * @return
     */
    private static int[] reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        nums = _reverse(nums, true, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
