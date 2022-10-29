package easy.algorithm.task6;

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length > 1) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
        return nums[0];
    }
}
