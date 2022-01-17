public class Solution41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int index = 0;
        while (index < length) {
            if (nums[index] <= length && nums[index] > 0 && nums[nums[index] - 1] != nums[index]) {
                int temp = nums[index];
                nums[index] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return length + 1;
    }
}
