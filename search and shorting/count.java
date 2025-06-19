public class CountingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;

        // Find the maximum element in the array
        int maxel = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxel) {
                maxel = arr[i];
            }
        }

        // Create a frequency array to count occurrences of each element
        int[] frequency = new int[maxel + 1];
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= maxel; i++) {
            while (frequency[i] > 0) {
                arr[index++] = i;
                frequency[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
