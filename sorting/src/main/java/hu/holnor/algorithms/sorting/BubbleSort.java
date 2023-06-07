package hu.holnor.algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble Sort
 * It is a simple sorting algorithm that compares adjacent elements and swaps them if they are in the wrong order.
 * It is not very efficient but is easy to understand.
 *
 * Use a nested for loop to traverse through the elements in the array and compare adjacent elements.
 *      The outer loop runs from index 0 to array length, while the inner loop runs from index 0 to n-i-1, where i is
 *      the number of elements that have already been sorted.
 * Compare the current element with the next element using an if statement. If the current element is greater
 *      than the next element, we swap them using a temporary variable.
 * Repeat this process until the entire array is sorted.
 * Print the sorted array using the Arrays.toString() method.
 *
 * Note that this algorithm is a stable one, that means it maintains the relative order of elements with equal values.
 *  This is because Bubble Sort only swaps adjacent elements if they are in the wrong order, so if two elements are equal,
 *  they will not be swapped.
 */

public class BubbleSort {
    public static int[] sort(int[] arrayToSort) {
        int length = arrayToSort.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public static void main(String[] args) {
        int[] arrayToSort = {23, 43, 13, 65, 11, -7, 76, 83, 9, 71, 84, 34, 96, 80};
        System.out.println("Original Array: " + Arrays.toString(arrayToSort));
        int[] sortedArray = BubbleSort.sort(arrayToSort);
        System.out.println("Sorted Array: "+ Arrays.toString(sortedArray));
    }
}
