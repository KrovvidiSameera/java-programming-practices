import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

class SetDemo {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);   // Duplicate, will not be added
        s.add(40);

        System.out.println("Set: " + s);

        System.out.println("Size: " + s.size());

        System.out.println("Contains 30: " + s.contains(30));

        s.remove(20);

        System.out.println("After removing 20: " + s);

        System.out.println("Is Set empty: " + s.isEmpty());
    }
}
