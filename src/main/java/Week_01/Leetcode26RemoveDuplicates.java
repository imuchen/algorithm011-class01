package Week_01;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/6/27 18:38
 */
public class Leetcode26RemoveDuplicates {

    // 1. p、q两个指针，初始化p=0,q=1
    // 2. 比较p、q两个位置的元素，不相等，则p++，nums[p]=nums[q]，q++
    public int removeDuplicates(int[] nums) {
        if(null == nums || nums.length == 0 ) {
            return 0;
        }
        int p = 0;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                p++;
                nums[p] = nums[q];
            }
        }
        return p + 1;
    }
}
