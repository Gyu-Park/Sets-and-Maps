# Sets-and-Maps
Learning Sets and Maps in Java

Reference: Introduction to Java Programming and Data Structures by Y Daniel Liang

# Sets 
- HashSet: values are not stored in the order in which the values are inserted into the HashSet. Instead, values are stored based on the HashCode.
- LinkedHashSet: values are stored in the order in which the values are inserted into the LinkedHashSet.
- TreeSet: values are sorted in ascending order.

Sets are way efficient than arrayList or LinkedList when checking if a value is in a Set and removing values.

# Maps
- HashMap: values are not stored in the order in which the values are inserted into the HashSet. Instead, values are stored based on the HashCode.
- LinkedHashMap: no argument constructor instanciates a LinkedHashMap with the insertion order; in contrast, with argument like LinkedHashMap(initialCapacity, loadFactor, true) instanciates a LinkedHashMap with the access order.
- TreeMap: values are sorted in ascending order.
