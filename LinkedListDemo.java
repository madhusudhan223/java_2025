import java.util.LinkedList;

public class LinkedListDemo {

    //
    public static void showDemo() {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.addFirst("c");
        list.addLast("c");

        list.removeLast();
        list.removeFirst();


        System.out.println(list);

        //  "ram", <--> "raj", <--> "hello"

        // if you frequently try to access the elements --> array list

        // while inserting the elements frequently --> Linked list

        // Each element has reference to its previous and next node
    }
}
