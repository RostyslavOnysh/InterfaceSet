package MainFolder.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<String> buyers = new LinkedList<>();
        buyers.add("Bob");
        buyers.add("Alice");
        buyers.add("John");
        buyers.add("Bill");
        System.out.println(buyers);

        System.out.println("OFFER add method ");
        buyers.offer("Bruce");
        System.out.println(buyers);

        System.out.println("PEEK");
        System.out.println(buyers.peek());
        System.out.println(buyers);

        System.out.println("POLL");
        System.out.println(buyers.poll());
        System.out.println(buyers);
        System.out.println("------------------");
        Stack<String> days = new Stack<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        System.out.println(days.pop());

    }


}
