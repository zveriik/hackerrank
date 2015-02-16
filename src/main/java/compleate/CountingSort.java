package compleate;

import java.util.Scanner;

/**
 * Created by Zveriki on 16.02.2015.
 */
public class CountingSort {

    public static Integer[] array;
    public static int length;

    public static void sort(Integer[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] numbersString = in.nextLine().split(" ");
        Integer[] unsortNumbers = new Integer[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            unsortNumbers[i] = Integer.parseInt(numbersString[i]);
        }
        sort(unsortNumbers);
        for (int i : unsortNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
