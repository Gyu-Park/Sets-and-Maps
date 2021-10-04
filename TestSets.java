import java.util.*;

/**
 *
 * @author Gyuseok
 */
public class TestSets {
    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();

        hashSet1.add("Luna");
        hashSet1.add("Steven");
        hashSet1.add("Lucas");
        hashSet1.add("Peter");
        hashSet1.add("John");
        hashSet1.add("Jane");
        hashSet1.add("Alice");
        hashSet1.add("Luna");

        // They are not stored in the order
        // in which they are inserted into the set.
        System.out.println(hashSet1);
        hashSet1.forEach(e -> System.out.print(e + " / "));
        System.out.println("\nIts's size is " + hashSet1.size());
        // [Alice, Luna, John, Lucas, Peter, Jane, Steven]
        // Alice / Luna / John / Lucas / Peter / Jane / Steven /
        // Its's size is 7

        hashSet1.remove("John");
        System.out.println("Its's size is " + hashSet1.size());
        // Its's size is 6

        Set<String> hashSet2 = new HashSet<>();

        hashSet2.add("Luna");
        hashSet2.add("Steven");
        hashSet2.add("Lucas");
        hashSet2.add("Bob");
        hashSet2.add("Kane");
        hashSet2.add("Son");

        System.out.println("hashSet1 contains Bob? " + hashSet1.contains("Bob"));
        System.out.println("hashSet2 contains Bob? " + hashSet2.contains("Bob"));

        hashSet1.addAll(hashSet2);
        System.out.println("After using hashSet1.addAll(hashSet2)");
        System.out.println("hashSet1 contains Bob? " + hashSet1.contains("Bob"));
        System.out.println(hashSet1);

        hashSet1.removeAll(hashSet2);
        System.out.println("After using hashSet1.removeAll(hashSet2)");
        System.out.println("hashSet1 contains Bob? " + hashSet1.contains("Bob"));
        System.out.println(hashSet1);

        hashSet1.retainAll(hashSet2);
        System.out.println("After retaining elements in hashSet2:" + hashSet1);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Cris");
        linkedHashSet.add("Alice");
        linkedHashSet.add("Bobby");
        linkedHashSet.add("Lisa");
        linkedHashSet.add("Sam");

        System.out.println(linkedHashSet);
        // The difference between HashSet and LinkedHashSet is that
        // LinkedHashSet stores strings in the order in which the strings are inserted.
        // But HashSet is based on array. Item index in array is calculated based on
        // hashCode() function.

        TreeSet<String> treeSet = new TreeSet<>(hashSet2);
        System.out.println("\nHashSet2: " + hashSet2);
        System.out.println("TreeSet: " + treeSet);
        // TreeSet sorts the Strings. That's the difference between HashSet and TreeSet

        System.out.println("\nTreeSet First: " + treeSet.first());
        System.out.println("TreeSet Last: " + treeSet.last());

        // headSet doesn't contain the argument and return previous values
        // tailSet return the argument with rest of values after the argument
        System.out.println("\nheadSet (Luna): " + treeSet.headSet("Luna"));
        System.out.println("tailSet (Luna): " + treeSet.tailSet("Luna"));

        // lower doesn't include the argument but floor does
        // higher doesn't include the argument but ceiling does
        System.out.println("\nlower (Luna): " + treeSet.lower("Luna"));
        System.out.println("higher (Luna): " + treeSet.higher("Luna"));
        System.out.println("floor (Luna): " + treeSet.floor("Luna"));
        System.out.println("ceiling (Luna): " + treeSet.ceiling("Luna"));

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("TreeSet After polling: " + treeSet);
    }

}