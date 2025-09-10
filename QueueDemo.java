import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

    public static void showDemo(){
//        List<String> customers = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();
//
        queue.add("c"); // to add the elements into queue
        queue.add("a");
        queue.add("b");
        queue.offer("d");
//        queue.remo



        // d--> b --> a --> c

         queue.poll();
//         queue.remo
//        queue.

//        var front = queue.peek();

//        var front1 = queue.element();

//        System.out.println(front);




        //add, offer --> to add the elements into queue

        //element, peek  --> to get the front element in the queue

        // remove, poll ---> it will remove the item at front



        System.out.println(queue);



    }
}

// If we want process the jobs based on the order we received them

//Array Deque -  Double ended queue
// priorityQueue -- when you are concerned about priority


