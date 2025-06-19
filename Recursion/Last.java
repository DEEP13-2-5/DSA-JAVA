public class Occurrence {
    public static int firstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i + 1);
    }

    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurrence(arr, key, i + 1); 
        if (isfound != -1) {
            return isfound; 
        }
        if (arr[i] == key) {
            return i;
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int startIndex = 0; 

        System.out.println("First Occurrence: " + firstOccurrence(arr, key, startIndex));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, key, startIndex));
    }
}
