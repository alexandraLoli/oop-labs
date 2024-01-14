import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskId = scanner.nextInt();
        scanner.close();

        /* Do not modify */
        Student s1 = new Student("Maria", "Popescu", 3, 8.5);
        Student s2 = new Student("Ion", "Grigorescu", 2, 8);
        Student s3 = new Student("Ana", "Enescu", 7, 7);
        Student s4 = new Student("Mihai", "Eminovici", 1, 4.45);
        Student s5 = new Student("Andrei", "Radu", 12, 2);

        List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        List<Student> copyStudents = new ArrayList<>(students);
        List<Student> anotherCopyStudents = new ArrayList<>(students);

        List<Integer> numbers = List.of(10, 20, 5, 243, 5556, 312, 566, 245, 122, 5556, 5, 10, 20, 122);
        ArrayList<String> subjects = new ArrayList<>(List.of("PP", "PA", "PCOM", "IOCLA", "AA",
                "SO", "CPL", "EP", "RL", "LFA"));
        Random random = new Random(12);
        /* End of unmodifiable zone */

        switch (taskId) {
            /* ------------------------- Task 1 ------------------------- */
            /* --------- Sort using Comparable<Student> interface ------- */
            case 1:

                System.out.println(students);
                break;
            /* ------------------------- Task 2 ------------------------- */
            /* -------------- Sort using a lambda expression ------------ */
            case 2:

                System.out.println(copyStudents);
                break;
            /* ------------------------- Task 3 ------------------------- */
            /* ----------- Implement your priority queue here ----------- */
            /* --------------- Use Comparator.comparing() --------------- */
            case 3:
                PriorityQueue<Student> priorityQueue = null;

                System.out.println(priorityQueue);
                break;
            /* ------------------------- Task 4 ------------------------- */
            case 4:
                Map<Student, LinkedList<String>> studentMap = new HashMap<>();
                students.forEach(s -> studentMap.putIfAbsent(s, new LinkedList<>()));
                /*----Add 4 random elements from subjects array in each LinkedList ----*/
                /*
                 * As index use the previously declared random object and use subjects.size() as
                 * your
                 * bound. Use addFirst() method to add elements in the LinkedList
                 */

                System.out.println(studentMap);
                break;
            /* ------------------------- Task 5 ------------------------- */
            /* ------------- No need to add or modify here -------------- */
            case 5:
                System.out.println(numbers);
                LinkedEvenSet linked = new LinkedEvenSet();
                linked.addAll(numbers);

                EvenSet set = new EvenSet();
                set.addAll(numbers);

                TreeEvenSet tree = new TreeEvenSet();
                tree.addAll(numbers);

                System.out.println(linked);
                System.out.println(set);
                System.out.println(tree);
            default:
                break;
        }

    }
}

class Student implements Comparable<Student> {
    /* ------------------------- Task 1 ------------------------- */
    /* Add student properties */
    /* Generate getters and setters */

    @Override
    public String toString() {
        return "Student {name=" + name + ", surname=" + surname + ", id=" + id + ", averageGrade=" + averageGrade + "}";
    }

    /* ------------------------- Task 4 ------------------------- */
    /* Override `equals` and `hashCode` methods */
}

class EvenSet extends HashSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

}

class LinkedEvenSet extends LinkedHashSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

}

class TreeEvenSet extends TreeSet<Integer> {
    /* Task 5 - Make it that it only accepts even Integers */

}