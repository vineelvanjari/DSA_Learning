//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationOfArray {

    // Approach 1: Modulo-based indexing
    public static int[] approach1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
        }

        return ans;
    }

    // Approach 2: Direct double assignment
    public static int[] approach2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        System.out.println("Original Array: " 
                            + Arrays.toString(nums));

        System.out.println("Approach 1: " 
                            + Arrays.toString(approach1(nums)));

        System.out.println("Approach 2: " 
                            + Arrays.toString(approach2(nums)));
    }
}
