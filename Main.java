
public class Main {
    /*
     * Main method
     */
    public static void main(String[] args) {
        // Generate an array of 100 random integers
        Integer[] nums = randIntArray(100, 0, 100);
        printArray(nums);

        // Search for the number 20 in the array
        int index = BinarySearch.indexOf(nums, 20);
        printIndex(index);

        // Generate an array of 100 random characters
        Character[] chars = randCharArray(100);
        printArray(chars);

        // Search for the character 'd' in the array
        index = BinarySearch.indexOf(chars, 'd');
        printIndex(index);

        // Generate an array of 100 random strings
        String[] strings = randStringArray(100);
        printArray(strings);

        // Search for the string "h" in the array
        index = BinarySearch.indexOf(strings, "h");
        printIndex(index);
    }

    /*
     * Generate a random integer
     * 
     * @param min The minimum value
     * @param max The maximum value
     * 
     * @return A random integer between min and max
     */
    private static int randInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    /*
     * Generate a random character
     * 
     * @return A random character between a and z
     */
    private static char randChar() {
        return (char)((int)(Math.random() * 26) + 97);
    }

    /*
     * Generate an array of random integers
     * 
     * @param size The size of the array
     * @param min The minimum value
     * @param max The maximum value
     * 
     * @return An array of random integers between min and max
     */
    private static Integer[] randIntArray(int size, int min, int max) {
        Integer[] nums = new Integer[size];

        // Fill the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = randInt(min, max);
        }

        // Sort the array
        java.util.Arrays.sort(nums);
        
        // Return the array
        return nums;
    }

    /*
     * Generate an array of random characters
     * 
     * @param size The size of the array
     * 
     * @return An array of random characters
     */
    private static Character[] randCharArray(int size) {
        Character[] chars = new Character[size];

        // Fill the array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = randChar();
        }

        // Sort the array
        java.util.Arrays.sort(chars);
        
        // Return the array
        return chars;
    }

    /*
     * Generate an array of random strings
     * 
     * @param size The size of the array
     * 
     * @return An array of random strings
     */
    private static String[] randStringArray(int size) {
        String[] strings = new String[size];

        // Fill the array
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(randChar());
        }

        // Sort the array
        java.util.Arrays.sort(strings);
        
        // Return the array
        return strings;
    }

    /*
     * Print an array
     */
    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    /*
     * Print the index of a value from an array
     */
    private static void printIndex(int index) {
        // If the index is -1, the key was not found
        if (index == -1) {
            System.out.println("\nThe value could not be found.\n"); 
            return;
        }

        // Print the index
        System.out.println("\nThe value was found at index " + index + "\n");
    }
}
