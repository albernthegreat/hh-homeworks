public class try {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[originalArray.length + 1];
        int elementToInsert = 6;
        int positionToInsert = 3;

        // Copy elements from the original array to the new array up to the insertion position
        for (int i = 0; i < positionToInsert; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new element at the insertion position
        newArray[positionToInsert] = elementToInsert;

        // Copy remaining elements from the original array to the new array
        for (int i = positionToInsert; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        // Print the new array
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New array after insertion: " + Arrays.toString(newArray));
    }
}
