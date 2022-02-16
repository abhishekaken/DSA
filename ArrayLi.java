import java.util.ArrayList;

public class ArrayLi {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(list.contains(3));
        list.set(3,999);
        list.remove(4);
        System.out.println(list);
        for(int i:list){
            System.out.println(i);
        }
        System.out.println(list.get(3));

    }

}
