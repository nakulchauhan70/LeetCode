public class RunningSumof1dArray {
    public static void main(String[] args) {
        runningSum(new int[]{1, 2, 3, 4});
    }

    private static int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
