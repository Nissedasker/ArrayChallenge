import Arrays.ArrayMethods;
import Arrays.BuggySolution;

public class Main {
    public static void main(String args[]) {
        ArrayMethods solution = new BuggySolution();

        // Create the array.
        short[] jumbledArray = solution.createJumbledArray(10);
        printArray(jumbledArray);

        // Sum it up.
        short sum = solution.sumUpArray(jumbledArray);
        System.out.println(String.format("Sum: %d", sum));

        // Sort the array.
        short[] sortedArray = solution.sortJumbledArray(jumbledArray);
        printArray(sortedArray);

        // Sum it up.
        sum = solution.sumUpArray(sortedArray);
        System.out.println(String.format("Sum: %d", sum));

    }


    static void printArray(short[] arrayToBePrinted) {
        System.out.print("Array:[ ");
        for (short number : arrayToBePrinted) {
            System.out.print(number);
            System.out.print(' ');
        }
        System.out.println("]");
        System.out.println();
    }
}


