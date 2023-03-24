/*
 *
 * Binary Search works best for sorted arrays. It works by dividing the array
 * in half, then checking if the key is less than or greater than the value at
 * the middle index. If the key is less than the value at the middle index, the
 * search continues on the left half of the array. If the key is greater than
 * the value at the middle index, the search continues on the right half of the
 * array. This process continues until the key is found or the array is empty.
 * 
 * Do not use a binary search on an unsorted array. It will not work.
 * 
 */

public class BinarySearch {
    /*
     * Check the type of the array then call the appropriate method.
     * 
     * This method is a wrapper for the other methods in this class. It checks the
     * type of the array and key, then calls the appropriate method.
     * 
     * @param arr The array to search
     * @param value The key to search for
     * 
     * @return The index where the key was found
     */
    public static <T> int indexOf(T[] array, T value) {
        // Search for an integer
        if (array instanceof Integer[] && value instanceof Integer) {
            return indexOfInt(
                (Integer[]) array, (int) value, 0, array.length - 1
            );
        }

        // Search for a character 
        if (array instanceof Character[] && value instanceof Character) {
            return indexOfChar(
                (Character[]) array, (char) value, 0, array.length - 1
            );
        }

        // Search for a string
        if (array instanceof String[] && value instanceof String) {
            return indexOfString(
                (String[]) array, (String) value, 0, array.length - 1
            );
        }

        // Return -1 for invalid option
        return -1;
    }

    /*
     * Binary search for integers
     * 
     * Divide the array in half, then check if the num is less than or greater than
     * the value at the middle index. If the num is less than the value at the
     * middle index, the search continues on the left half of the array. If the num
     * is greater than the value at the middle index, the search continues on the
     * right half of the array. This process continues until the num is found or
     * the array is empty.
     * 
     * @param array The array to search
     * @param num The number to search for
     * @param start The start index of the array
     * @param end The end index of the array
     * 
     * @return The index where the number was found
     */
    public static int indexOfInt(Integer[] array, int num, int start, int end) 
    {
        // Find the middle index
        int middleIndex = (start + end) / 2;

        // If we've reached the end of the array, return -1
        if (start > end) {
            return -1;
        }

        // If the middle index equals the key, return the middle index
        if (array[middleIndex] == num) {
            return middleIndex;
        }

        // If the key is less than the value at the middle index
        // search the left half of the provided array
        if (num < array[middleIndex]) {
            return indexOfInt(array, num, start, middleIndex - 1);
        }

        // If the key is greater than the value at the middle index
        // search the right half of the provided array
        if (num > array[middleIndex]) {
            return indexOfInt(array, num, middleIndex + 1, end);
        }

        // If the key was not found, return -1
        return -1;
    }

    /*
     * Binary search for characters
     * 
     * Divide the array in half, then check if the character is less than or greater
     * than the value at the middle index. If the character is less than the value
     * at the middle index, the search continues on the left half of the array. If
     * the character is greater than the value at the middle index, the search
     * continues on the right half of the array. This process continues until the
     * character is found or the array is empty.
     * 
     * @param array The array to search
     * @param c The character to search for
     * @param start The start index of the array
     * @param end The end index of the array
     * 
     * @return The index where the character was found
     */
    public static int indexOfChar(Character[] array, char c, int start, int end)
    {
        // Find the middle index
        int middleIndex = (start + end) / 2;

        // If we've reached the end of the array, return -1
        if (start > end) {
            return -1;
        }

        // If the middle index equals the key, return the middle index
        if (array[middleIndex] == c) {
            return middleIndex;
        }

        // If the key is less than the value at the middle index
        // search the left half of the provided array
        if (c < array[middleIndex]) {
            return indexOfChar(array, c, start, middleIndex - 1);
        }

        // If the key is greater than the value at the middle index
        // search the right half of the provided array
        if (c > array[middleIndex]) {
            return indexOfChar(array, c, middleIndex + 1, end);
        }

        // If the key was not found, return -1
        return -1;
    }

    /*
     * Binary search for strings
     * 
     * Divide the array in half, then check if the string is less than or greater
     * than the value at the middle index. If the string is less than the value at
     * the middle index, the search continues on the left half of the array. If the
     * string is greater than the value at the middle index, the search continues
     * on the right half of the array. This process continues until the string is
     * found or the array is empty.
     * 
     * @param array The array to search
     * @param str The string to search for
     * @param start The start index of the array
     * @param end The end index of the array
     * 
     * @return The index where the string was found
     */
    public static int indexOfString(String[] array, String str, int start, int end) 
    {
        // Find the middle index
        int middleIndex = (start + end) / 2;

        // If we've reached the end of the array, return -1
        if (start > end) {
            return -1;
        }

        // If the middle index equals the key, return the middle index
        if (array[middleIndex].equals(str)) {
            return middleIndex;
        }

        // If the key is less than the value at the middle index
        // search the left half of the provided array
        if (str.compareTo(array[middleIndex]) < 0) {
            return indexOfString(array, str, start, middleIndex - 1);
        }

        // If the key is greater than the value at the middle index
        // search the right half of the provided array
        if (str.compareTo(array[middleIndex]) > 0) {
            return indexOfString(array, str, middleIndex + 1, end);
        }

        // If the key was not found, return -1
        return -1;
    }
}
