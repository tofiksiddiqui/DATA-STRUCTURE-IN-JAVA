import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetUsingFrame {
    public static void main(String[] args) {
        Set<Integer> hasSet = new HashSet<>();
        hasSet.add(10);
        hasSet.add(50);
        hasSet.add(100);
        hasSet.add(60);
        hasSet.add(200);
        System.out.println("Has set contains : " + hasSet);
        hasSet.remove(10);
        System.out.println("After removing element : " + hasSet);
        System.out.println("\n\n\n");
        System.out.println("---Implementing Lisnked Has Set---\n\n");
        Set<Integer> linkedHasSet = new LinkedHashSet<>();
        linkedHasSet.add(10);
        linkedHasSet.add(50);
        linkedHasSet.add(100);
        linkedHasSet.add(60);
        linkedHasSet.add(200);
        System.out.println("Linked Has set contains : " + linkedHasSet);
        linkedHasSet.remove(10);
        System.out.println("After removing Linked Has set contains : " + linkedHasSet);
        System.out.println("\n\n\n");
        System.out.println("---Implementing Tree  Set---\n\n");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(60);
        treeSet.add(200);
        System.out.println("Tree set contains : " + treeSet);
        treeSet.remove(10);
        System.out.println("After removing element : " + treeSet);
        System.out.println("\n\n\n");

    }
}
