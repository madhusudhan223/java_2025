
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterFaceDemo {

    Collection<String> list = new ArrayList<>(); //

    public static void showDemo(){

        List<String> list = new ArrayList<>(); // ordered collection --> here we have control over thr index.
//        list.add;
//        list.add("raj");
//        list.add("hello");
//        list.add("abc");
//
//        Collections.sort(list);


        List<Customer> customers = new ArrayList<>();

//        new

        // object --> instance of class
        // class - blueprint

        customers.add(new Customer("raj", "gfc@gmail.com"));
        customers.add(new Customer("abc", "abef@gmail.com"));
        customers.add(new Customer("hari", "adc@gmail.com"));

//        customers.add(new Customer("hello"));

//        Collections.sort(customers);
        Collections.sort(customers, new EmailComparator());
//        Collections.sort(customers, new NameComp());

//        so
//        Collections.so
        System.out.println(customers);

//        "dfs".equalsIgnoreCase()

//        sort --> done based upon comparing logic

//        list.add(0, "hello");  // add method will allow us to add the elements at particular index


//        list.remove("hello");
//        list.remove(1);
//        System.out.println(list.get(1));
//        System.out.println(list.indexOf("abc"));
//        System.out.println(list.lastIndexOf("raj"));

        // sort data --->

//        System.out.println( list.subList(2, 4));
//        System.out.println(list);

        // 2, 3

        //  0, 1   --> first - inclusive , second - exclusive
        // 0, 1, 2
        // 0, 1, 2, 3


    }





}
