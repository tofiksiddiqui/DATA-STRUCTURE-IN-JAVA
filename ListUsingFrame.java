import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListUsingFrame {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("List contains : " + list);
        System.out.println("removing element at  2nd position : ");
        list.remove(2);
        System.out.println("List contains now : " + list);
        System.out.println("How to get second element : ");
        int GetElement = list.get(1);
        System.out.println("Element at first position : " + GetElement);
        System.out.println(list);
        System.out.println("Setting new Element in list : ");
        list.set(0, 100);
        list.set(1, 200);
        list.set(2, 300);
        System.out.println("List contains now : " + list);
        System.out.println("Using array we will display list : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List contains : " + list.get(i));
        }
        System.out.println("\n\n");
        System.out.println("---Implementing List Iterator---\n");
        ListIterator<Integer> d = list.listIterator();
        while (d.hasNext()) {
            System.out.println("Forward direction : " + d.next());
        }
        while (d.hasPrevious()) {
            System.out.println("Backword direction : " + d.previous());
        }

    }
}
