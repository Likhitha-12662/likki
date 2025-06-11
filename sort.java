class Solution {
    public int search(int[] nums, int target) {
        // corner case
        if (nums == null || nums.length == 0) return -1;

        // step 1: find the split
        int portion1End;

        int left = 0;
        int right = nums.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) left = mid;
            else right = mid - 1;
        }

        // post processing
        if (nums[right] >= nums[0]) portion1End = right;
        else portion1End = left;

        // Classical BS in portion 1 & 2
        int index = getIndexOfTarget(nums, 0, portion1End, target);
        if (index != -1) return index;
        else {
            return getIndexOfTarget(nums, portion1End + 1, nums.length - 1, target);
        }
    }

    // Helper: Classical BS
    // return the index of Target in nums[left, right], NOT rotated
    // if not exist, return -1
    int getIndexOfTarget(int[] nums, int left, int right, int target) {
        // corner case
        if (left > right) return -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
