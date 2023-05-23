```java
public class MyStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int top;

    public MyStack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T item) {
        if (top == elements.length - 1) {
            expandCapacity();
        }
        elements[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = elements[top];
        elements[top--] = null; // Optional: Set the reference to null for garbage collection
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void expandCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
```

У цьому прикладі MyStack реалізований з використанням масиву elements, який містить елементи стеку. Змінна top вказує на вершину стеку (індекс останнього елемента). Методи push() додають елемент до вершини стеку, pop() видаляє та повертає елемент з вершини стеку, peek() повертає елемент з вершини стеку без його видалення. Методи isEmpty() та size() перевіряють, чи стек порожній і повертають його розмір відповідно.

Також в реалізації є приватний метод expandCapacity(), який збільшує розмір масиву elements, якщо стек заповнений.

Використання цього власного стеку може бути наступним:

```java
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.pop());  // Output: 3
        System.out.println(stack.peek()); // Output: 2
        System.out.println(stack.size()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
    }
}
```

Цей приклад додає числа до стеку, видаляє останнє додане число (pop()), повертає елемент з вершини стеку без його видалення (peek()), повертає розмір стеку (size()) та перевіряє, чи стек порожній (isEmpty()).

Stack — это линейная структура данных, которая следует принципу LIFO (последний пришел, первый ушел). Это означает, что объекты могут быть вставлены или удалены только с одного конца, также называемого вершиной.

```java 
class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
    // Конструктор для инициализации stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    // Вспомогательная функция для добавления элемента `x` в stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // Вспомогательная функция для извлечения верхнего элемента из stack
    public int pop()
    {
        // проверка на опустошение stack
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
 
        // уменьшаем размер stack на 1 и (необязательно) возвращаем извлеченный элемент
        return arr[top--];
    }
 
    // Вспомогательная функция для возврата верхнего элемента stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
 
    // Вспомогательная функция для возврата размера stack
    public int size() {
        return top + 1;
    }
 
    // Вспомогательная функция для проверки, пуст stack или нет
    public boolean isEmpty() {
        return top == -1;               // или return size() == 0;
    }
 
    // Вспомогательная функция для проверки, заполнен ли stack или нет
    public boolean isFull() {
        return top == capacity - 1;     // или return size() == capacity;
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);      // вставляем 1 в stack
        stack.push(2);      // вставляем 2 в stack
 
        stack.pop();        // удаление верхнего элемента (2)
        stack.pop();        // удаление верхнего элемента (1)
 
        stack.push(3);      // вставляем 3 в stack
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        // удаление верхнего элемента (3)
 
        // проверяем, пуст ли stack
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
```