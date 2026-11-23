// https://leetcode.com/problems/build-array-from-permutation

import java.util.Arrays;

public class BuildArrayFromPermutation {

    // Approach 1: Using Extra Array
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }


    // Approach 2: Optimized In-place Encoding
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    
    public static int[] buildArrayOptimized(int[] nums) {

        int n = nums.length;

        // Encoding
        for (int i = 0; i < n; i++) {
            int a = nums[nums[i] % n] % n;
            nums[i] = nums[i] + (a * n);
        }

        // Decoding
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }



    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println("Extra Array: " +
                Arrays.toString(buildArray(nums)));

        System.out.println("Optimized: " +
                Arrays.toString(buildArrayOptimized(nums.clone())));

    }

}
