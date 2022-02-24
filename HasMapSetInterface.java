import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HasMapSetInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "mohammad");
        map.put(6, "e");
        System.out.println("Has Map contains : " + map);
        map.put(5, "tofik");
        System.out.println("Has Map contains : " + map);
        map.putIfAbsent(3, "Engineer");
        System.out.println("Has Map contains : " + map);
        map.putIfAbsent(7, "Engineer");
        System.out.println("Has Map contains : " + map);
        map.remove(7, "Engineer");
        System.out.println("Has Map contains : " + map);
        System.out.println("Has Map contains : " + map.isEmpty());
        for (Integer d : map.keySet()) {
            System.out.println("Hash Map key : " + d);
        }
        for (String g : map.values()) {
            System.out.println("Hash Map value is : " + g);
        }
        System.out.println("\n\n\n");
        System.out.println("---Implementing Tree Map---\n");
        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "a");
        tmap.put(4, "c");
        tmap.put(3, "b");
        tmap.put(2, "z");
        tmap.put(5, "mohammad");
        tmap.put(6, "e");
        System.out.println("Tree Map contains : " + tmap);
        tmap.put(5, "tofik");
        System.out.println("Tree Map contains : " + tmap);
        tmap.putIfAbsent(3, "Engineer");
        System.out.println("Tree Map contains : " + tmap);
        tmap.putIfAbsent(7, "Engineer");
        System.out.println("Has Map contains : " + tmap);
        tmap.remove(7, "Engineer");
        System.out.println("Tree Map contains : " + tmap);
        System.out.println("Tree Map contains : " + tmap.isEmpty());
        for (Integer d : tmap.keySet()) {
            System.out.println("Tree Map key : " + d);
        }
        for (String g : tmap.values()) {
            System.out.println("Tree Map value is : " + g);
        }
        System.out.println("\n\n\n");
    }
}
