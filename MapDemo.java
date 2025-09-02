import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void showDemo() {
        Customer c1 = new Customer("Raj", "e1");
        Customer c2 = new Customer("Ram", "e2");
        Customer c3 = new Customer("Hello", "e3");
        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);

//
//        const obj = {
//                name : "hello",
//                phone: 964040
//
//        };


//        obj.name --> "hello"
//        obj.phone ---> 964040

//        map.get("name") --> "hello"
//        map.get("phone") ---> 964040


        System.out.println(map.get("e3")); // null

//        O(1) --> 10, 20, 1000

        // O(n) ---> 10, 1000

        System.out.println(map);

//        ser with email id e2



//        List<Customer> customersList = new ArrayList<>();
//        customersList.add(new Customer("raj","e1"));
//        customersList.add(new Customer("ram","e2"));
//
//
//        // user with email id e2  --> 1000 users
//
//        for(var customer: customersList) {
//            System.out.println("loop");
//            if (customer.getEmail() == "e2") {
//                System.out.println("Found!");
//            }
//        }




        // map contains --> key, value pair --->
        // always key should be unique and string

        // "e1" : {name: "raj", email: "e"}

        // O(n) --> big o notation


        // list of 10 users ---> 10 times

        // 1000 users ----> 1000 times O(1000)


        // map uses --> hash tables ---> O(1) --> faster

//    map.get('e')--->

//    map uses hash tables --->

        // Map ---> HashMap ---> hash table

//    python, c# - dictionary
        // java - maps
        // js (javascript) : Objects --> {name: "a"}


//    for(var customer: customers){
//     if(customer.getEmail()=="e"){
//        System.out.println("Found!");
//    }
//
//    }

        // list of 10 users -->

        // email id --> "e"

//    Map  --> key values

        // Data structures

        // Hash tables
    }
}
