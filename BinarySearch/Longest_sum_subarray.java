package BinarySearch;

import java.util.TreeSet;

public class Longest_sum_subarray {
    public static int getMaxDifference(int[] nums, int start, int end) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    public static int longestSubarray(int[] nums, int limit) {
        int maxLength = 0;

        // Check all possible subarrays
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // Find the maximum absolute difference in the subarray nums[i..j]
                int difference = getMaxDifference(nums, i, j);

                // If the difference is within the limit, update the maxLength
                if (difference <= limit) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 7 };
        int limit = 4;

        int answer = longestSubarray(arr, limit);
        System.out.println("the length of longest substring is: " + answer);

    }

}
