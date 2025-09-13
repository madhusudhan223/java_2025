import com.code.lambdaExpression.ConsumerDemo;
import com.code.lambdaExpression.FunctionInterfacesDemo;
import com.code.lambdaExpression.LambdaExpressionDemo;
import com.code.lambdaExpression.LambdaMethodAndVariable;

import java.io.IOException;
import java.util.*;

// iterable -->

public class Main {

    // this method should be used when user Logins.
    // variable and mehods - should have camel case
    // class name shoud have pascal case
    public static void main(String[] args) {

        var list = new GenericList<String>();

        list.add("Raj"); // 0 index
        list.add("Ram"); // 1 index
        list.add("Hello"); // 2 index

//        QueueDemo.showDemo();
//        SetsDemo.showDemo();
//         MapDemo.showDemo();
//         LinkedListDemo.showDemo();
//        PriorityQueueDemo.showDemo();
//        LambdaExpressionDemo.showDemo();
//        LambdaMethodAndVariable.showDemo();
//        FunctionInterfacesDemo.showDemo();

        ConsumerDemo.showDemo();
        // to make this generic list iterable without knowing any internal implementation - we have to use iterable interface

        // there is one solution --> but that is not the right way



        Collection <String> items = new ArrayList<>();

//        ListInterFaceDemo.showDemo();

//        List<String> listItems = new ArrayList<>();
//        listItems.add




        items.add("raj");
        items.add("ram");
        items.add("hello");
        items.add("test");

//        [0, 1]


        Collection <String> otherCollection = new ArrayList<>();

        otherCollection.addAll(items); // which adds the all elements

//        System.out.println(otherCollection);


//        otherCollection.add("raj");
//        otherCollection.add("ram");
//        otherCollection.add("hello");
//        otherCollection.add("test");

//        int a = 10;
//      int b= 10

        // pass by value
        // String []


        // new Num(10)  --> adrees
        // new num(10) -- adress

//        pass by reference


//        ==, <, > --> primitives

//        System.out.println(items == otherCollection);

//        System.out.println(items.equals(otherCollection));

        //


//        String [] convertedArray = items.toArray(new String[0]);

//        System.out.println(convertedArray);




////      items.remove("hello");
//        items.clear();

//        System.out.println(items.isEmpty());
//        System.out.println(items.contains("hello"));

//        "hello".length()

//        System.out.println(items.size());



        //LIst interface



//        for(var item: items){
//            System.out.println(item);
//        }

        //
//        foreach  -- Arrays and collections
//        Collections.addAll(items, "a","b", "c");

        //

//        new

//        items.addAll(items, "ram - collection", "ram - collection")

//        for(var item: items){
//            System.out.println(item);
//        }





        // Collec

        // collections



        // for each is syntatic sugar over the iterator object

//

//        var list = new GenericList<String>();
//        var iterator = list.iterator();


        // hasNext(), next()

        // condition num < 0 ==> true or false

        // public boolean hasNext(){};
        // public <T> next();

//        ["Raj", "Ram", "hello"]
//                                |
//        while(iterator.hasNext()){
//        var current = iterator.next(); // "raj", "ram", "hello" // it gives current and moves cursor to next element
//        System.out.println(current);
//
//        }


        // while
        //



//        forEach : which can
//        String[] names = {"raj", "ram", "heloo"};
//
//        for(String item:names){
//            System.out.println(item);
//        }

//
//        var object1 = new User(10);
//        var object2 = new User(20);
//
//        if(object1.compareTo(object2) < 0 ) {
//            System.out.println("object1 is less than object2");
//        }
//        if(object1.compareTo(object2) == 0 ) {
//            System.out.println("object1 is equal to object2");
//        }
//        if(object1.compareTo(object2) > 0 ) {
//            System.out.println("object1 is greater than object2");
//        }
//
//        System.out.println(Utils.max(new User(50), new User(30)));

//        var list = new List(5);
//        list.add(100); // 0
//        list.add(200); //
//        System.out.println(list.get(0));

//        var list = new ObjectList(5);
////        new
//        list.add(1); // Integer.valueOf(1), Float, Boolean
//        list.add("Raj");
//        int number = (int)list.get(0);
//        System.out.println(number);

//        javc filename
//                java filename


//        var list = new GenericList<Integer>();
//        var names = new GenericList<String>();
//        var decimal = new GenericList<Float>();
//        var decimals = new GenericList<Double>();
//        var userList = new GenericList<User>();
//        new GenericList<Boolean>();
//        list.add(1); // to store this value it will create a instance of Integer, Boolean, Short, Float
//        Boxing

//        list.get(0) ; // unboxing --> while accessing the element again it will convert reference data type into primitive

//        to store the primitive it will create instance of their respective Wrapper class(Integer, Boolean, Short, Float) - Boxing

        // Generics will allow us to identify the errors at the compilation time itself


        // constraints (Restriction) -
        // Type Erasure
        //


//        [1, 2, 3,]
        // ["Raj", "Ram"]

        // generics --> type safety -- during compilation time it will suggest errors


                // for every primitives we have wrapper class

        // Integer, Float, Boolean
//        System.out.println(list.get(0));



        // new TaxCalculator()

//        var calculator = new TaxCalculator2025(100_000);

        //

        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            System.out.println("input data is invalid");
        }

//        var price1 = new Price(2000);
//        var price2 = new Price(1000);
//        var item = new Item();
//        System.out.println(item.itemPrice(price2));

        // method parameter

        // creating any method / calling any method --> method name and method parameters

//        var taxReport = new TaxReport();

//        var can be anything  --> strings, num, [], instances

        //

//        var taxReport = new TaxReport(calculator); // constructor injection
//        taxReport.setCalculator(calculator); // setter injection
//        taxReport.showTax(calculator); // method injection

        // interface segregation principle --> divide big interfaces into small ones, interface should focus on single capability


//        var taxReport = new TaxReport(claculator);

        // method

        // constructor, setter and method
//        claculator.calculateTax(0.5F);
//        System.out.println(claculator.calculateTax(0.5F));
//        var test = new TaxCalculator(claculator);


//      constructor injection


//      taxReport.showTax();

//        var product = new Product(true);
//        TextBox textBox = new TextBox();
//        System.out.println(textBox.toString());
//        System.out.println(textBox);

//        logText(textBox);

//       var product = new Product();

//
//        Product[] products = {new TextBox(), new Title()};
//        for(var product:products){
//           product.render("hello", 200);
//        }

      // Encapsulation, Abstraction, inheritance, polymorphism

        // polymorphism -->it allows an object taking different forms;

        // Abstract classes
        // Abstract methods; will have only declaration but not implementation

//        Abstract class -- it won't allow user to create an instance of it.


        // deep inheritance --> always child will have one parent --> but it has nested inheritance
        // multiple inheritance

//        one child class extends multiple parent classes - because of ambiguity java won't support this
//        class a class b

//       product --> textbox, title

//        interface

//        class a --> interface _-> class b
        // the more you apply abstractions -> will reduce coupling

//    //we use interfaces to build loosely coupled applications


//  interface is similar to class but it will only have method declaration, there will be no implementation;

//        public void claculateTax();

        // what should be done --> interfaces\
        // how should be done ---> classes.

//        interface are mostly used in

        // data compression
        // encryption
        // sorting
        // searching









//

//        decimal - 0-9
//        hexa decimaal - 0-9 A-f
//        A-10,B-11, c-12, d-13, e-14, f-15
//        textBox1.toString()
//        textBox1.set
//        var textBox2 = new TextBox();
//        var object = new Object();
//        System.out.println(textBox.toString());
//        System.out.println(textBox.isEnabled());
//        System.out.println(textBox2.hashCode());
//        object.
//        0
// poly morphism
//  many forms --> it allows an object to take differnt forms

        // upcasting -- casting an object to one of its super type --> implicit
        // down casting --> casting an object to one of its sub type
    };
    public static void logText(Product product){
        var text = (TextBox) product;
//        System.out.println(text.se);

    }
};
//        System.out.println(textBox.hashCode());

        //hashCode: it takes the address of your memory and it will map with number

//        textBox.setText("Hello world");
//        System.out.println(textBox.getUserInput());
//        textBox.
//        textBox.user


        // by default every class have one parent ---> Object class

//         int number = 20;
//         String name = "Heloo";
//
//         char letter = 'a';

//        compile time errors, run time error

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your Name : ");
//
//        String userName = scanner.nextLine();
//
//        System.out.println("your Name is : " +  userName );



//        strings, Arrays

//       Arrays --> collection of elements
//        int [] numbers  =  new int[3];
//           numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        int[] numbers = { 4, 3, 1};
//        Arrays.sort(numbers);

//        System.out.println(Arrays.toString(numbers));

//        2 x 3 3

//        int [] [] numbers = new int[2][3];
//        int [] [] numbers = {{1,2,3}, {4,5,7}};
//        System.out.println(Arrays.deepToString(numbers));

//        constants
//          final float pi = 3.14F;


//        Arithmetic expressions

//        Addition, substr, division, % reminder
//
//        int x = 10;
//        int y = x++;
//        System.out.println(y);
//        System.out.println(x);

//        float num = 1.1F;
//        System.out.println(Math.round(num)); // greater or equal to 1.5 it will round off greast number else it will round off to nearest number.
//        System.out.println(Math.floor(num));
        // Math.ceil  ---> greatest number
        // Math.floor ----> least number

//        int x = 10;
//        int y = 20;
//        System.out.println(Math.min(x,y));

//        int randomValue = (int)Math.round(Math.random() * 1000); // it renerates random value 0 to 1;
//        System.out.println(randomValue);

//        double x = 1.1;
//        int y =  (int)x + 2;

//        String age = "25.89";
//        System.out.println(Double.parseDouble(age));

//        boolean isFraud = true;


          //

        // developer: frontend, backend, tester: manual, automation, infra: servers, product: who will give the projects
//        String role = "devel";

//        0.1  10%

//        float number = 0.1F;
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        System.out.println(percent.format(number));


//        switch (role){
//            case "developer" :
//                System.out.println("developer");
//                break;
//            case "tester":
//                System.out.println("Tester");
//                break;
//            case "infra":
//                System.out.println("Infra");
//                break;
//        case "product":
//                 System.out.println("product Manager");
//            default:
//                System.out.println("No match found");
//        }
//
////        if(role=="developer"){
////            System.out.println("developer");
////        }else if(role=="tester"){
////            System.out.println("Tester");
////        }else if(role == "infra"){
////            System.out.println("Infra");
////        }else{
//        System.out.println("No match found");
////        }

        // loops ::

//        you have to hello words -- loops

//        System.out.println("hello world");
//        System.out.println("hello world");
//        System.out.println("hello world");
//        System.out.println("hello world");
//        System.out.println("hello world");


//        for loop // initialization, condition, iterator

//        if you know how many times task needs to be repeated
//
//        for(int i=0; i < 5; i++) {
//            System.out.println("Hello world " + i);
//        }

//        forEach only used arrays or collections

//     String[] fruits = new String[3];
//     fruits[0] = "Apple";
//     fruits[1]= "Orange";
//     fruits[2] = "Banana";

//     String[] fruits = {"Apple", "Orange", "Banana"};

//        0,1,2
//        3
// 3

//        i = 2;
//        1


//
//        for(int i=fruits.length - 1; i>=0; i--) {
//            System.out.println("for loop " + fruits[i] +  i);
//        }
//
//
//
//     for(String fruit: fruits){
//         System.out.println("for each loop " + fruit);
//     }

//        for each loop work only for forward direction


//        you have to read the input from the user till he types quit

        // break; it breaks out of the loop - terminate the loop
        // continue; moves control to the beginning of the loop

//        Scanner scanner = new Scanner(System.in);
//        comparison works input != "quit"
//            String input = "";
//        while (true){
//            System.out.println("please enter input");
//             input = scanner.next();
//            if(input.equals("quit")) break;
//            if(input.equals("pass")) continue;
//            System.out.println(input);
//        }

//        forEach



//        do{
//            System.out.println("please enter input");
//            input = scanner.next();
//            System.out.println(input);
//
//        }while (!input.equalsIgnoreCase("quit"));

//        do while ---> executes the logic first and then checks for condition
//        --> it will executes atleast once  --> even if condition true or false.


////        while loop
//        int i = 0;
//        while (i < 5){
//            System.out.println("Hello world " + i);
//            i++;
//        }
//        System.out.println(i);



//
//        int amount = 8000;
//
//        String priceToShow = amount > 10000 ? "High price" : "Low price";
//
//        System.out.println(priceToShow);

//        highPrice = amount > 10000 , --> high price : low price
//       &,  &&  --> returns true only when both conditions are true. otherwise it will return false
//       |,  || ---> return true if any one of the condition is true
//        !

//        user ---> should be eligle for offer

//        user cart must greater > 200, and user has linked his mobile
//
//        if( x > 10  && x < 30){
//            System.out.println("hello");
//        }else{
//            System.out.println("world");
//        }


        // variables and constants
        // numbers strings arrays
        // type casting
        // arithmetic expressions

//        operators ::
//        comparsion operators : == , >=, <=, !=
//        logical operators : AND operator, OR operator, Not operator.
//        conditional operators : if , ternary

//        total 600

//        500 and above --> grade A and percentage
//        400-500 ---> grade B and percentage
//        300 - 400--> grade c and percentage
//        if below 300 - grade D and percentage

//        45 / 2 ===> 45 % 2 = remainder ==> 1 odd number

//        if(x % 2 == 0){
//            System.out.println("given number is even");
//        }else{
//            System.out.println("given number is odd");
//        }

//        if(true){
//
//        }else if(true){
//
//        }else if(true){
//
//        }else{
//
//        }



//        1.1 + 2.0 = 3.1
//        System.out.println(y);
        // implicit casting --> byte>short>int>long>flat>double
        // explicit casting


//        x = x + 1;
//            x++;
//        int y= 3;
//        double z = (double)x / (double) y;
//        int z = 3 + 2 * 3 ;



//          pi = 1;
//        int x = 30; // primitive data type
//        int y = 20;
//        x = 10;
//        System.out.println(x);
//        System.out.println(y);
//        long noOfViews = 3123456789L;
//        float x = 43.99F;
//        int x = 45.99;
//        String name = new String("Raj");

//          String name = "c:\\windows\\...";

//        System.out.println(name);
//
//        Date now = new Date(); // reference data type
//        System.out.println(now.getTime());


        // 3,43,000
//        boolean isUserLoggedIn = true;

        // declaration and assign the value

//        x--> 30, y ---> 20

//      adress
//                reference data types -- >

//        byte x = 1;
//        byte y = x ;
//        x = 2;
//        System.out.println(x);
//        System.out.println(y);
//
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 4;
//        System.out.println(point1);
//        System.out.println(point2);

//[ 2] --> x
//     [1] ---> y

//        [adresses] ---> point1
//        [adresses]   ---> point2
//    }
//    greetUser();
//};

// oops --> object oriented programming system

//encapsulation ---> bundling the data and methods(which operates on data) into a single unit
//abstraction  ---> reduce complexity by hiding unnecessary details
// coupling

// a --> b ---> c -- coupled each other.

//

//polymorphism
//inheritance

// class --> object

//class -- creating blueprint for objects


// class ---> fields,   methods

//car -->
// fields  carSpeed -> carMileage, carDistanceCovered
// methods --> strat(), stop(), brake()

//object : an instance of class

// Car car1 = new Car();
// Car car2 = new Car();

//car1, car2, car3




//CarDistanceCovered








// variable

//two --> primitive data types and reference data types

//primtive data types  - 8 types

// byte -  1 byte
// short - 2 byte
// int    - 4 bytes     - numbers
// long - 8 bytes

//670.999

// float - 4 bytes
// double - 8 bytes


// char -- > 'A' -- > 'B'
// boolean -> true,  false

// there are two stage

//println()

//class Name ---> pascal case  ---> ProductDetails
// function name / method name ---> camel case --> fetchUserDetails()
// variable ---> camel case

// fetchUserDetails(userName){
//
// }

//fetchUserDetails("
// ")



//compilation stage -
//excution stage -

// access modifiers - > public , private, protected

// method - it performs task

// return type --> void  --> it return nothing

