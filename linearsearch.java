import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Taking the elements of the array from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Taking the target element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Performing linear search
        int result = linearSearch(numbers, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
