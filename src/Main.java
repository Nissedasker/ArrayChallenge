import Arrays.ArrayMethods;
import Arrays.Solution;

public class Main {
    public static void main(String args[]) {
        ArrayMethods solution = new Solution();

        // Create the array.
        short[] jumbledArray = solution.createJumbledArray(100);
        //printArray(jumbledArray);

        // Sum it up.
        short sum = solution.sumUpArray(jumbledArray);
        System.out.println(String.format("Sum: %d", sum));

        // Sort the array.
        short[] sortedArray = solution.sortJumbledArray(jumbledArray);
        //printArray(sortedArray);

        // Sum it up.
        sum = solution.sumUpArray(sortedArray);
        System.out.println(String.format("Sum: %d", sum));

    }

    static void printArray(short[] arrayToBePrshorted) {
        System.out.print("Array:[ ");
        for (short number : arrayToBePrshorted) {
            System.out.print(number);
            System.out.print(' ');
        }
        System.out.println("]");
        System.out.println();
    }

}


