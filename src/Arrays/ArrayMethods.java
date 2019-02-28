package Arrays;

public interface ArrayMethods {
    /**
     *
     * @param size, the size of the array
     * @return and array with "size" numbers
     * Lowest number is 1, next 2, etc...
     * There are no duplicated numbers.
     * e.g. createJumbledArray(10) returns an array like [4,7,5,1,3,2,8,10,9,6] or any other order.
     */
    short[] createJumbledArray(int size);

    /**
     *
     * @param arrayToBeSummed an array with numbers to be added up.
     * @return a single number = the sum of the elements in the array.
     */
    short sumUpArray(short[] arrayToBeSummed);

    /**
     *
     * @param jumbledArray an array with numbers in a random order.
     * @return an array where the 1st number is 1, next 2, etc...
     */
    short[] sortJumbledArray(short[] jumbledArray);

}
