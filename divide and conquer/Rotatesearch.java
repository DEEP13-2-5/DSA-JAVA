public class RotateSearch {
    public static int rotate(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            // Target is in the left half
            if (tar >= arr[si] && tar <= arr[mid]) {
                return rotate(arr, tar, si, mid - 1);
            } else {
                return rotate(arr, tar, mid + 1, ei);
            }
        } else {
            // Right half is sorted
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return rotate(arr, tar, mid + 1, ei);
            } else {
                return rotate(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int tar = 0;
        int tarIdx = rotate(arr, tar, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
