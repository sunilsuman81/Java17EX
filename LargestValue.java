public class LargestValue {

    /**
     * Finds the largest number in an array of integers.
     *
     * @param numbers the array of integers
     * @return the largest number in the array
     */
    public static int findLargest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 0, 5, 9, 2}; // Example array
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
