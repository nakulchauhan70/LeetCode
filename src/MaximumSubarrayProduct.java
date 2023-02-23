public class MaximumSubarrayProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(maxProduct(new int[]{-2, 0, -3}));
        System.out.println(maxProduct(new int[]{-2}));
        System.out.println(maxProduct(new int[]{-3, -1, -1}));

    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int curProd = 1;
        int maxProd = 0;

        for (int num : nums) {
            if (curProd < 0) {
                curProd = 1;
            }

            curProd *= num;
            maxProd = Math.max(curProd, maxProd);
        }

        return maxProd;
    }
}
