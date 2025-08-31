import java.util.*;
import java.util.List;

public class SetMethodsDemo {
    public static void showDemo(){

        // union ---> combination of two sets and removes the duplicates if any

//        List<String> collection = new ArrayList<>();

//        Both are same

//        Collections.addAll(collection, "a", "b", "c");
//        Arrays.asList("a", "b", "c")



        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c" , "d"));
        Set<String> set2 = new HashSet<>(Arrays.asList("d", "f", "g", "h"));

//        set1.addAll(set2); // union -->  combination of two sets --> if there are any duplicates those will be removed
//        set1.retainAll(set2); // intersection --> common values will be retained
//        set1.removeAll(set2);  // remove the elements from set1 which are already there in set2

//        System.out.println(set1);

//        "Ram", "hello", "raj"  --> "Hari", "sita", "hello"





//        System.out.println(); set1  "a" , "b", "c", "d"

//        System.out.println(set1); // union



//        System.out.println(set1);
//        set1.add("a");
//        set1.add("b");
//        set1.add("c");


        // union --> intersection --> difference

//  set 1 --> "a" , "b", "c"
//  set 2 ---> "b", "c", "d"

// "a" , "b", "c", "b", "c", "d"  -->  "a", "b", "c", "d"


    }
}
