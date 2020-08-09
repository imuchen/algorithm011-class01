package Week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/7/26 17:41
 */
public class LC18FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // 指针夹逼法

        // 数组排序
        Arrays.sort(nums);

        int length = nums.length;

        for (int h = 0; h < length - 3; h++) {

            if (h > 0 && nums[h] == nums[h - 1]) {
                continue;
            }

            // 最小值大于target或最大值小于target则进入下一轮循环
            int hSumMin = nums[h] + nums[h + 1] + nums[h + 2] + nums[h + 3];
            if (hSumMin > target) {
                continue;
            }
            int hSumMax = nums[h] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (hSumMax < target) {
                continue;
            }

            for (int i = h + 1; i < length - 2; i++) {
                if (i > h + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1;
                int k = length - 1;

                int iSumMin = nums[h] + nums[i] + nums[j] + nums[j + 1];
                if (iSumMin > target) {
                    continue;
                }

                int iSumMax = nums[h] + nums[i] + nums[k - 1] + nums[k];
                if (iSumMax < target) {
                    continue;
                }

                // j、k指针左右夹逼
                while (j < k) {
                    // 和为target，j++ && k--
                    int sum = nums[h] + nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[h], nums[i], nums[j], nums[k]));
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        k--;
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (sum > target) {
                        // 和大于target，k--
                        k--;
                    } else {
                        // 和小于target，j++
                        j++;
                    }


                }
            }


        }
        return result;
    }
}
