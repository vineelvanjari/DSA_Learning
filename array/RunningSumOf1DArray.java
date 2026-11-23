// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumOf1DArray {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println("Running Sum: " + Arrays.toString(runningSum(nums)));
    }
}
