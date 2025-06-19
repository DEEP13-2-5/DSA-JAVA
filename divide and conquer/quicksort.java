//quick sort
import java.util.*;

public class Quicksort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int end) {
        if (si >= end) {
            return;
        }
        int pdIdx = partition(arr, si, end);
        quicksort(arr, si, pdIdx - 1);
        quicksort(arr, pdIdx + 1, end);
    }

    public static int partition(int arr[], int si, int end) {
        int pivot = arr[end];
        int i = si - 1;
        for (int j = si; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
