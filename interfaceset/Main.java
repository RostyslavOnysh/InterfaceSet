package MainFolder.interfaceset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Bob");
        names.add("Bob");
        names.add("Alice");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("John");

        List<String> nameList = new ArrayList<>();
        nameList.add("Alice");

        System.out.println(names);
        System.out.println(nameList);
        System.out.println(names.contains("Bob"));
    }
}
