import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        // 1. Creating an array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // 2. Accessing an element
        System.out.println("Element at index 2: " + arr[2]); // Output: 30

        // 3. Updating an element
        arr[2] = 35;
        System.out.println("Updated Array: " + Arrays.toString(arr)); // 30 → 35

        // 4. Inserting an element (manually shifting)
        arr = insertElement(arr, 2, 25);
        System.out.println("After Insertion: " + Arrays.toString(arr));

        // 5. Deleting an element (manually shifting)
        arr = deleteElement(arr, 3);
        System.out.println("After Deletion: " + Arrays.toString(arr));

        // 6. Searching for an element
        int searchElement = 40;
        int index = searchElement(arr, searchElement);
        System.out.println(searchElement + " found at index: " + index);

        // 7. Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 8. Reversing the array
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        // 9. Filtering elements greater than 25
        int[] filtered = filterGreaterThan(arr, 25);
        System.out.println("Filtered Array (elements > 25): " + Arrays.toString(filtered));
    }

    // Method to insert an element at a specific index
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    // Method to delete an element from a specific index
    public static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // Method to search for an element in the array
    public static int searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method to filter elements greater than a given value
    public static int[] filterGreaterThan(int[] arr, int threshold) {
        return Arrays.stream(arr).filter(x -> x > threshold).toArray();
    }
}
