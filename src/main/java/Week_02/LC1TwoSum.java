package Week_02;

import java.util.HashMap;

/**
 * Created by tianguoxing on 2020/7/5 11:05.
 */
public class LC1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int x = target-nums[i];
            if(hashMap.containsKey(x)){
                return new int[] {i,hashMap.get(x)};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(25 & 26);
    }
}
