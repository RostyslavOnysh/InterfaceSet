# Stack
In Java, a stack is a linear data structure that follows the 
* ***Last-In-First-Out (LIFO) principle***.
It represents a collection of elements where new elements are added and removed from the top of the stack. 
The Stack class in Java provides a set of methods to interact with stacks.
 ## Here are some important features and methods of the Stack class:

* ***push(element):***
This method is used to insert an element onto the top of the stack.
* ***pop():*** 
This method is used to remove and return the element at the top of the stack.
* ***peek():***
This method is used to retrieve, but not remove, the element at the top of the stack.
* ***empty():***
This method checks if the stack is empty and returns a boolean value.
* ***search(element):***
This method returns the 1-based position of the element from the top of the stack.
If the element is not found, it returns -1.
  ### Why use a stack?
Stacks are useful in scenarios where you need to maintain the order of elements based on their arrival time or process elements in a specific order. 
Some common use cases for stacks include:


* Function call and recursion: Stacks are used by programming languages to manage function 
calls and recursion. When a function is called, its context is pushed onto the stack, and when the function returns,
its context is popped from the stack.

* Expression evaluation: 
Stacks can be used to evaluate arithmetic expressions, especially those written in postfix 
or prefix notation. The operands are pushed onto the stack, and when an operator is encountered,
the operands are popped, and the result is pushed back onto the stack.

* Undo/Redo operations:
 Stacks can be employed to implement undo and redo functionality in applications.
Each action performed by the user is pushed onto the stack, 
allowing for easy reversal of actions or redoing previously undone actions.

#### Example 
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Popping an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Peeking at the top element of the stack
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);

        // Searching for an element in the stack
        int position = stack.search("Apple");
        System.out.println("Position of 'Apple': " + position);
    }
}
```
##### Output
```java
Stack: [Apple, Banana, Cherry]
Popped element: Cherry
Top element: Banana
Is stack empty? false
Position of 'Apple': 2
```

In the example above, we create a Stack using the Stack class.
We push elements onto the stack using the push() method, pop an element using the pop() method,
peek at the top element using the peek() method, check if the stack is empty using the empty() method, 
and search for an element using the search() method.

To summarize, a stack is a useful data structure that follows the Last-In-First-Out (LIFO) principle.
It provides a way to manage elements in a specific order and is utilized in various scenarios, such as function calls, expression evaluation, and undo/redo operations.