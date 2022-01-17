public class Solution35 {
    public static void main(String[] args) {
        System.out.println(searchInsert2(new int[]{1, 3, 5, 6}, 5));
    }

    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public static int search(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = (left + right) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return search(nums, target, left, mid - 1);
        } else {
            return search(nums, target, mid + 1, right);
        }
    }
}
