public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex2(new int[]{1, 7, 3, 6, 5, 6}));
    }

    private static int pivotIndex(int[] nums) {
        int pivotIndex = -1;

        int sum = 0;
        int leftSum = 0;
        int rightSum;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = sum - nums[i] - leftSum;

            if (rightSum == leftSum) {
                pivotIndex = i;
                break;
            }

            leftSum = leftSum + nums[i];
        }

        return pivotIndex;
    }

    private static int pivotIndex2(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        rightSum = totalSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
