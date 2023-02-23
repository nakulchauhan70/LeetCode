public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-4, -3, -2, -1}));
    }

    private static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }

            curSum += num;
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
