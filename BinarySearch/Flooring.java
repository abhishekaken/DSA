package BinarySearch;

public class Flooring {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,  6, 7, 8, 9, 10};
        int key = 5;
        int ans=floor(arr, key);
        System.out.println(ans);

    }

    private static int floor(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid =start+ (end-start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
