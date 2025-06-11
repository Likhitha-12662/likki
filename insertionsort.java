public class InsertionSortExample {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];       // Current element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element rightward
                j = j - 1;
            }

            arr[j + 1] = key; // Insert the key at correct position
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6 };

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}

