import java.util.*;
import java.util.List;

public class SetsDemo {
    public static void showDemo(){

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add("raj");
        set.add("ram");
        set.add("hello");
        set.add("raj");


        list.add("raj");
        list.add("ram");
        list.add("hello");
//         does not

        System.out.println(set);
        System.out.println(list);


        // remove duplications from collection
//
//        List<String> collection = new ArrayList<>();
//
//        Collections.addAll(collection, "a", "b", "c", "d", "d", "a");
//
//        System.out.println(collection);
//
//        Set<String> uniqueValues = new HashSet<>(collection);
//        System.out.println(uniqueValues);
//        collection.add("a");
//        collection.add("b");


    }
}


// Set -->
// Collection that contains no duplicates ---> unique values.
// does not guarantee the order of item


// union --> intersection --> difference

//  set 1 --> "a" , "b", "c"
//  set 2 ---> "b", "c", "d"

// "a" , "b", "c", "b", "c", "d"  -->  "a", "b", "c", "d"


// set will maintain unique values.






