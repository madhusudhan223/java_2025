import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsDemo {
    public static void showDemo(){

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add("raj");
        set.add("ram");
        set.add("hello");
//        set.add("raj");


        list.add("raj");
        list.add("ram");
        list.add("hello");
        // does not

        System.out.println(set);
        System.out.println(list);


    }
}


// Set -->
// Collection that contains no duplicates ---> unique values.
// does not guarantee the order of item


// union --> intersection --> difference


