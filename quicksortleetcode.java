public class QuickSortSolution {
    
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }
    
    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];  // Choose the last element as pivot
        int i = low - 1;  // Index of smaller element
        
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        
        // Place pivot in the correct position
        swap(nums, i + 1, high);
        return i + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // For testing
    public static void main(String[] args) {
        QuickSortSolution solution = new QuickSortSolution();
        int[] nums = {5, 2, 3, 1};
        int[] sorted = solution.sortArray(nums);
        
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 5
    }
}
