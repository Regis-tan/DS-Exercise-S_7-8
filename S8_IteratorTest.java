package DataStructures_Projects;

import java.util.*;

public class S8_IteratorTest {
    public static void get_tc(int n) {
        LinkedList<Integer> MyList = new LinkedList<>();

        // Adding elements to the LinkedList
        for (int i = 0; i < n; i++) {
            MyList.add(i);
        }

        long starting_time = System.currentTimeMillis();

        Iterator<Integer> iter = MyList.iterator();
        while (iter.hasNext()) {
            iter.next();
        }

        long ending_time = System.currentTimeMillis();

        long time_taken = ending_time - starting_time;
        System.out.println("Operation Finished (n: "+n+"), Time taken: " + time_taken + " ms");
    }

    public static void main(String[] args) {
        get_tc(5000);
        get_tc(3000000);
    }
}
