import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    // this method should be used when user Logins.
    // variable and mehods - should have camel case
    // class name shoud have pascal case
    public static void main(String[] args) {



        // new TaxCalculator()

        var calculator = new TaxCalculator2025(100_000);
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

