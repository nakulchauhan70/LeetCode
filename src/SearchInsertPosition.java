public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    //1,3,5,6   2
    private static int search(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = (left + right) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (target < nums[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }

        return search(nums, target, left, right);
    }
}
