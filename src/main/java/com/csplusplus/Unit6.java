package com.csplusplus;

public class Unit6 {

    // 1. Sum of all elements in an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2. Find the maximum element in an array
    public static int maxElement(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 3. Return a new array with elements in reverse order
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // 4. Check if the array is sorted in ascending order
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 5. Count occurrences of a number in the array
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}
