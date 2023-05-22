# ***TreeSet***
 is a class in Java that implements the ***Set*** interface and provides a sorted, 
ordered set of elements. It is implemented as a red-black tree, which allows efficient 
* insertion,
* deletion,
* and retrieval operations*.

### Here are some key points about ***TreeSet***:

* ***TreeSet*** maintains its elements in ascending order or according
to a custom Comparator provided during initialization.
The elements in a TreeSet must be mutually ***comparable***
(implement the Comparable interface) or a custom ***Comparator*** must be provided.
* ***TreeSet*** does not allow *duplicate elements*. It ensures that each element is unique in the set.
* The basic operations like *insertion, deletion, and retrieval* have a time complexity of ***O(log n)***, 
where n is the number of elements in the set.
* ***TreeSet*** provides additional methods for navigating the set and performing range-based operations.
* ***TreeSet*** does not allow *null* elements (unless a custom Comparator that supports null is provided),
as it relies on element comparison for ordering.

### Here's an example of how to use TreeSet:
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println(numbers);  // Output: [1, 2, 4, 5, 8]
        
        // Iterate over the TreeSet
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Check if an element exists in the TreeSet
        boolean contains = numbers.contains(4);
        System.out.println(contains);  // Output: true
        
        // Remove an element from the TreeSet
        numbers.remove(2);
        System.out.println(numbers);  // Output: [1, 4, 5, 8]
        
        // Get the size of the TreeSet
        int size = numbers.size();
        System.out.println(size);  // Output: 4
        
        // Clear the TreeSet
        numbers.clear();
        System.out.println(numbers);  // Output: []
    }
}
```


In the example above, we create a TreeSet called numbers to store integers.
1. We add elements to the set, and they are automatically sorted in ascending order. 
2. We can perform various operations on the set, such as iterating over the elements, 
checking for element existence, removing elements, getting the size of the set, and clearing the set.

## Remember to import the java.util.TreeSet class to use TreeSet in your Java program.