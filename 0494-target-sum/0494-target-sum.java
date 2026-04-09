class Solution {

    public int sumWays(int[] nums, int target, int idx, int sum) {
        if (idx == nums.length) {
            if (sum == target) return 1;
            return 0;
        }

        return sumWays(nums, target, idx + 1, sum + nums[idx]) +
               sumWays(nums, target, idx + 1, sum - nums[idx]);
    }

    public int findTargetSumWays(int[] nums, int target) {
        return sumWays(nums, target, 0, 0);
    }
}