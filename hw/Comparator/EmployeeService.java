package hw.Comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmployeeService {
    public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int namesCompared = emp1.getName().compareTo(emp2.getName());
                if (namesCompared != 0) {
                    return namesCompared;
                } else {
                    return Integer.compare(emp1.getAge(), emp2.getAge());
                }
            }
        };
        Collections.sort(employees, employeeComparator);

        Set<Employee> sortedEmployees = new LinkedHashSet<>(employees);
        return sortedEmployees;
    }
}


/*
 @Override
      public int compare(Employee firstEmployee, Employee secondEmployee) {
        // if the age is the same, sort by their name
        if (firstEmployee.getAge() == secondEmployee.getAge()) {
          // use method compareTo() of String class that sort alphabetically by default
          return firstEmployee.getName().compareTo(secondEmployee.getName());
        }
        // sort employees from younger to older
        return firstEmployee.getAge() < secondEmployee.getAge() ? -1 : 1;
      }
    };
    // variable for storing sorted employees,
    Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
    // add all employees to set to sort them
    sortedEmployees.addAll(employees);
    // return sorted employees
    return sortedEmployees;
  }
}

 */