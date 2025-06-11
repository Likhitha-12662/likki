class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int last = arr.length - 1;
        List<Integer> ans = new ArrayList<>();

        while (last != -1) {
            // Find index of max in arr[0..last]
            int max = Integer.MIN_VALUE;
            int ind = -1;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    ind = i;
                }
            }

            // Flip max to front if needed
            if (ind != 0) {
                ans.add(ind + 1);
                reverse(arr, ind);
            }

            // Flip max to correct position
            ans.add(last + 1);
            reverse(arr, last);

            last--;
        }

        return ans;
    }

    private void reverse(int[] arr, int k) {
        int left = 0, right = k;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
