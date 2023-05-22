package MainFolder.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // зберігає данні у відсортованому вигляді

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(-10);
        numbers.add(4);
        numbers.add(1);
        numbers.add(99);
        numbers.add(7);
        numbers.add(-50);
        numbers.add(0);
        System.out.println(numbers);
        /*
        виводимо на екран сет намберс і бачимо що числа вивелись в зростаючому порядку а в хеш сет побачимо що дані виводятсія не у відсортованому порядку
         */

        Set<Users> users = new TreeSet<>();
        //TreeSet в класі User потрібно показувати шо і як порівнювати та implements Comparable
        users.add(new Users("Sokas", 23));
        users.add(new Users("Bob", 32));
        users.add(new Users("John", 42));
        users.add(new Users("Alice", 31));
        System.out.println(users);

    }
}
