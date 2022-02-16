import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(max(array));
        System.out.println(maxRange(array,1,6));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    static int maxRange(int [] array, int start, int end) {
        int max=array[start];
        for (int i=start+1;i<=end;i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
    static void reverse(int [] array) {
        int start=0;
        int end=array.length-1;
        while(start<end) {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }




    }
    static int max(int[] array) {
        int max=array[0];
        for (int i=1;i<array.length;i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
}
