package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = binarySearch(arr, key,0, arr.length - 1);
        System.out.println("The index of " + key + " is " + (index+1));
}

    private static int binarySearch(int[] arr, int key,int low , int high) {
        int mid= (low+high)/ 2;
        if (arr[mid] == key) {
            return mid;
        }else if(low>high){
            if (arr[mid] > key) {
                return binarySearch(arr, key, low, mid - 1);
            }
            else{
                return binarySearch(arr, key, mid + 1, high);
            }
        }else{
            return -1;
        }
    }
}
