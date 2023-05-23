# Queue 
 * Унаслідуєтся від Collection interface
 * Працює по принципу first in first out
 * LinkedList<>(); є найбільш популярною реалізацією як листa(List) так і черги(Queue).

In Java, a queue is a data structure that follows the ***First-In-First-Out (FIFO) principle***.
It represents a collection of elements where new elements are added at the end, and existing elements are removed from the beginning.
The Queue interface in Java provides a set of methods to interact with queues. 
*Here are some important methods and features of the Queue interface:*

* ***add(element) / offer(element):***
These methods are used to add an element to the end of the queue.
If the queue has a fixed capacity and is ***full***, the add() method ***throws an exception***, while the offer() method 
returns a special value (false or null) to indicate the failure of insertion.
* ***remove() / poll():***
These methods are used to remove and return the element at the beginning of the queue. 
If the queue is empty, the remove() method throws an exception,
while the poll() method returns a special value (null) to indicate the failure of retrieval.
* ***element() / peek():***
These methods are used to retrieve, but not remove, the element at the beginning of the queue.
If the queue is empty, the element() method throws an exception, while the peek() method returns a special value (null)
to indicate the absence of an element.
* ***size():*** This method returns the number of elements present in the queue.
* ***isEmpty():*** This method checks if the queue is empty and returns a boolean value.

## Why use a queue?
Queues are useful in scenarios where you need to maintain the order of elements based on their arrival time 
or process elements in a specific order. Here are a few examples of when queues are commonly used:

* Task scheduling: Queues can be used to schedule and manage tasks or processes. New tasks are added to the end of the queue, and the scheduler processes tasks in the order they were added.

* Breadth-first search: In graph algorithms like breadth-first search, queues are used to keep track of nodes to be visited. Nodes are added to the queue as they are discovered and visited in a specific order.

* Message passing: Queues are often used in messaging systems, where messages are sent and received in a sequential manner. Messages are enqueued at the sender's end and dequeued at the receiver's end.

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing elements from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Retrieving the element at the front of the queue
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);
    }
}
```

Output : 

```java
Queue: [Apple, Banana, Cherry]
Removed element: Apple
Front element: Banana
Queue size: 2
```

In the example above, we create a Queue using the LinkedList implementation.
We add elements to the queue using the add() method, remove an element using the remove() method,
~~~~retrieve the front element using the peek() method,
and obtain the size of the queue using the size() method.