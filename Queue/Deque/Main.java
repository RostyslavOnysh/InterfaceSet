package MainFolder.Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> buyers = new LinkedList<>();
        buyers.add("Bob");
        buyers.add("Alice");
        buyers.add("John");
        System.out.println(buyers);
        System.out.println("---------------------");
        System.out.println(buyers.pollFirst());
        System.out.println("---------------------");
        System.out.println(buyers.pollLast());
        System.out.println("---------------------");
        System.out.println(buyers.removeLast());

    }
}
