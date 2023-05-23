# Deque
stands for ***"double-ended queue,"*** which is a linear data structure that allows 
* ***insertion and removal of elements from both ends.***
It can function as both a queue and a stack, providing flexibility in managing elements.

### The *Deque interface* 
in Java provides methods for inserting and removing elements from both ends of the deque.
Here are some important methods of the Deque interface:
* ***addFirst(element) / offerFirst(element):*** These methods insert an element at the beginning of the deque.
* ***addLast(element) / offerLast(element):*** These methods insert an element at the end of the deque.
* ***removeFirst() / pollFirst():*** These methods remove and return the element from the beginning of the deque.
***removeLast() / pollLast():*** These methods remove and return the element from the end of the deque.
* ***getFirst() / peekFirst():*** These methods retrieve, but not remove, the element at the beginning of the deque.
* ***getLast() / peekLast():*** These methods retrieve, but not remove, the element at the end of the deque.

## The key difference between a *Queue and a Deque*
is the ability to add and remove elements from ***both ends of the data structure***.
In a Queue, elements are added at one end (the rear) and removed from the other end (the front),
following the FIFO principle. However, in a Deque, elements can be inserted and removed from both ends,
allowing it to function as a queue, stack, or a combination of both.

Here's a simple example that demonstrates the usage of Deque:
```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
public static void main(String[] args) {
Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addLast("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");

        // Displaying the deque
        System.out.println("Deque: " + deque);

        // Removing elements from the deque
        String removedElement = deque.removeFirst();
        System.out.println("Removed element: " + removedElement);

        // Retrieving the first and last elements of the deque
        String firstElement = deque.peekFirst();
        String lastElement = deque.peekLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Size of the deque
        int size = deque.size();
        System.out.println("Deque size: " + size);
    }
}
```
#### Output:

```java
Deque: [Cherry, Apple, Banana]
Removed element: Cherry
First element: Apple
Last element: Banana
Deque size: 2
```
In the example above, we create a Deque using the ArrayDeque implementation. 
We add elements to the deque using the addLast() and addFirst() methods,
remove an element using the removeFirst() method, retrieve the first and last elements using the 
peekFirst() and peekLast() methods, and obtain the size of the deque using the size() method.

### To summarize,
a Deque is a double-ended queue that allows insertion and removal of elements from both 
ends. It offers more flexibility compared to a regular Queue by providing methods for operations at both
ends of the data structure.