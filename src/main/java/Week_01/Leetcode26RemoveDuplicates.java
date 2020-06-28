package Week_01;

/**
 * Desc:给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
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
