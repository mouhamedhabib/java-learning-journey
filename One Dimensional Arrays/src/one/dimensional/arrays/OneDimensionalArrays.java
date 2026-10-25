package one.dimensional.arrays; 

import java.util.Arrays;
public class OneDimensionalArrays {

    public static void main(String[] args) {
        // 1. Create fixed array of size 3
        int[] numbers = {10, 20, 30};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Access & Update
        int firstItem = numbers[0];
        numbers[1] = 25; // Update index 1
        System.out.println("After Update: " + Arrays.toString(numbers));

        // 3. Append (Requires creating a larger array)
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[numbers.length - 1] = 40; // Assign new value to the last spot
        System.out.println("After Append: " + Arrays.toString(numbers));

        // 4. Delete (Requires shifting elements or shrinking array)
        // Let's remove the element at index 1 (value 25)
        int indexToRemove = 1;
        int[] newNumbers = new int[numbers.length - 1];
        
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (i == indexToRemove) {
                continue; // Skip the item we want to delete
            }
            newNumbers[k++] = numbers[i];
        }
        numbers = newNumbers; // Point back to the updated array
        System.out.println("After Delete: " + Arrays.toString(numbers));
    }
}
