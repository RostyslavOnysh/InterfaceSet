package MainFolder.Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Stack<String> plates = new Stack<>();

        plates.add("Plates 1");
        plates.add("Plates 2");
        plates.add("Plates 3");
        plates.add("Plates 4");
        plates.add("Plates 5");

        System.out.println(plates.pop());

        System.out.println(plates);
        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        System.out.println(ages);
    }
}
