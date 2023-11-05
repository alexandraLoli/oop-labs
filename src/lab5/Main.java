package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

interface Task {
    /**
     * Executes the action characteristic of the task.
     */
    void execute();
}

interface Container {
    /**
     * Removes a Task from the Container.
     *
     * @return the removed Task, if the Container is not empty;
     *         null, otherwise
     */
    Task pop();

    /**
     * Inserts a Task in the Container.
     *
     * @param task the inserted Task
     */
    void push(Task task);

    /**
     * Returns the number of elements from the Container.
     *
     * @return The number of elements in this container.
     */
    int size();

    /**
     * Verifies if the Container is empty or not.
     *
     * @return true,  if the Container is empty
     *         false, otherwise
     */
    boolean isEmpty();

    /**
     * Transfers all the elements that exist in a Container in this Container.
     *
     * @param container the Container from which we should transfer elements.
     *                  After the transfer, container.size() == 0
     */
    void transferFrom(Container container);

    /**
     * Return all the tasks stored in the Container.
     *
     * @return The list of the tasks stored in the Container.
     */
    ArrayList<Task> getTasks();
}

class OutTask implements Task {
    // TODO 1.1.1: Create a field to store the message

    // TODO 1.1.2: Implement a constructor
    public OutTask(String message) {}

    // TODO 1.1.3: Implement the execute() method
    @Override
    public void execute() {}
}

// TODO 1.2: Implement RandomOutTask

// TODO 1.2.1: Create a global Random instance which uses 12345 as seed
    //  HINT: use final static to store this

// TODO 1.2.2: Generate a random number in constructor
    //  HINT: use a final field


// TODO 1.3: Implement CounterOutTask
// TODO 1.3.1: Add a global counter


// TODO 2: Implement Stack and Queue
//  (transferFrom should move all the elements from
//  source container into the current one)


// TODO 3: Create the following interfaces: Minus, Plus, Mult, Div
//  and the Operation class which implements them


// TODO 4.1: Create Song as a concrete class and
//  Album as an abstract class

// TODO 4.2: Implement DangerousAlbum, ThrillerAlbum and BadAlbum



public class Main {
    private static List<Task> taskList = new ArrayList<>();;

    private static void loadTasks() {
        // TODO: uncomment the lines below

//        if (taskList.isEmpty()) {
//            taskList.add(new OutTask("First message task"));
//            taskList.add(new RandomOutTask());
//            taskList.add(new CounterOutTask());
//            taskList.add(new OutTask("Second message task"));
//            taskList.add(new CounterOutTask());
//            taskList.add(new RandomOutTask());
//        }
    }

    private static void test1() {
        for (Task task : taskList) {
            task.execute();
        }
    }

    private static void test2() {
        // TODO: uncomment the lines below

        // System.out.println("----> Queue");
        // Queue q = new Queue();
        // for(Task task : taskList) {
        //     q.push(task);
        // }
        // q.pop();
        // q.pop();
        // for (Task task : q.getTasks()) {
        //     task.execute();
        // }

        // System.out.println("----> Stack");
        // Stack s = new Stack();
        // for(Task task : taskList) {
        //     s.push(task);
        // }
        // s.pop();
        // s.pop();
        // for (Task task : s.getTasks()) {
        //     task.execute();
        // }

        // System.out.println("----> Testing transferFrom");
        // q.transferFrom(s);

        // for (Task task : q.getTasks()) {
        //     task.execute();
        // }

        // // This should print true
        // System.out.println(s.isEmpty());
    }

    static private void test3() {
        // TODO: uncomment the lines below

        // Operation op = new Operation(13.5f);
        // op.div(0.f);
        // op.div(1.f);
        // System.out.println(op.getNumber());  // 13.5
        // op.mult(2.f);
        // System.out.println(op.getNumber());  // 27
        // op.minus(3.f);
        // System.out.println(op.getNumber());  // 24
        // op.plus(7.f);
        // System.out.println(op.getNumber());  // 31
    }


    private static void test4() {
        // TODO: uncomment the lines below

        // Song song1 = new Song("Bad", 101, "Michael Jackson");
        // Song song2 = new Song("Dangerous", 19, "Michael Jackson");
        // Song song3 = new Song("Heal the world", 53, "Composer");
        // Song song4 = new Song("Thriller", 82, "Michael Jackson" );
        // Song song5 = new Song("Beat it", 83, "Michel Jakson");
        // Song song6 = new Song("Smooth Criminal", 77, "Composer");

        // DangerousAlbum dangerous = new DangerousAlbum();
        // dangerous.addSong(song2);
        // dangerous.addSong(song3);
        // dangerous.addSong(song6);
        // System.out.println(dangerous);

        // ThrillerAlbum thriller = new ThrillerAlbum();
        // thriller.addSong(song4);
        // thriller.addSong(song6);
        // thriller.addSong(song5);
        // System.out.println(thriller);

        // BadAlbum bad = new BadAlbum();
        // bad.addSong(song1);
        // bad.addSong(song6);
        // System.out.println(bad);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        loadTasks();

        if (task == 1) {
            test1();
        } else if (task == 2) {
            test2();
        } else if (task == 3) {
            test3();
        } else {
            test4();
        }
    }
}
