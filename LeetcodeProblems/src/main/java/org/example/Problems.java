package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problems {
    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        int[] bottomUp = new int[n + 1];
        bottomUp[0] = 1;
        bottomUp[1] = 1;
        for (int i = 2; i <= n; i++) {
            bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
        }

        return bottomUp[n];
    }
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;

        return -1;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

        }

        return ans;
    }

    public static int lengthOfLongestSubstring(String s) {
        String ans = "";
        int max = 0;
        if (s.length() == s.chars().distinct().count()) {
            return s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                ans = s.substring(i, j);
                if (j == s.length() && ans.length() == ans.chars().distinct().count()) {
                    if (max < ans.length()) {
                        max = ans.length();
                        ans = "";
                        break;
                    }
                    else {
                        ans = "";
                        break;
                    }
                }
                if (ans.length() != ans.chars().distinct().count()) {
                    if (max < ans.length() - 1) {
                        max = ans.length() - 1;
                        ans = "";
                        break;
                    }
                    else {
                        ans = "";
                        break;
                    }
                }
            }
        }

        return max;
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = nums[0];
        int largest = Arrays.stream(nums).max().getAsInt();;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }

            sum = nums[i + 1];
        }

        if (max > largest) {
            return max;
        }
        else {
            return largest;
        }
    }
}
