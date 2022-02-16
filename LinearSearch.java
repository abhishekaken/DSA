import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int length = input.nextInt();
        System.out.println("Enter the number of elements in the list: ");
        for(int i = 0; i < length; i++) {
            list.add(input.nextInt());
        }
        System.out.println("Enter the number to search for: ");
        int search = input.nextInt();
        int index = linearSearch(list, search);
        if(index == -1) {
            System.out.println("The number is not in the list.");
        }
        else {
            System.out.println("The number is in the list at index " + index);
        }
    }

    private static int linearSearch(ArrayList<Integer> list, int search) {
        for(int i:list){
            if(i==search){
                return list.indexOf(i);
            }
        }
        return -1;
    }
}
