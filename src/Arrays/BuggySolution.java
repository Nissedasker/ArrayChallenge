package Arrays;

import java.util.Random;

public class BuggySolution implements ArrayMethods {
    @Override
    public short[] createJumbledArray(int arraySize) {
        short[] result = new short[arraySize];

        // Create a sorted array.
        for (short index = 0; index < result.length; index++) {
            result[index] = getRandomNumber(1, arraySize);
        }

        // Jumble the array
        short temp1;
        short temp2;
        for (short c = 0; c < arraySize; c++) {
            short index1 = getRandomNumber(0, result.length);
            short index2 = getRandomNumber(0, result.length);

            temp1 = result[index1];
            temp2 = result[index2];

            result[index1] = temp2;
            result[index2] = temp1;
        }
        return result;
    }

    @Override
    public short sumUpArray(short[] arrayToBeSummed) {
        short sum = 0;
        for (short number : arrayToBeSummed)
            sum += number;
        return sum;
    }

    @Override
    public short[] sortJumbledArray(short[] jumbledArray) {
        boolean sorted = false;

        short number1;
        short number2;
        while(!sorted) {
            sorted = true;
            for (short index = 0; index < jumbledArray.length - 1; index+=2) {
                number1 = jumbledArray[index];
                number2 = jumbledArray[index + 1];

                if (number1 > number2) {
                    sorted = false;
                    jumbledArray[index] = number2;
                    jumbledArray[index + 1] = number1;
                }
            }
        }
        return jumbledArray;
    }

    private short getRandomNumber(int low, int high) {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return (short) result;
    }

}
