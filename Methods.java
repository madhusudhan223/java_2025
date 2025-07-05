public class Methods {

    public static void main(String [] args){

       String userFullName = getFullName("Ram", "raju"); // method calling
//        System.out.println(userFullName);

////        TextBox textBox1 = new TextBox();
        var textBox1 = new TextBox(); // 100560
        textBox1.setText("hello");  // userInput : "hello"

//

        var texBox2 = textBox1; //textBox1 and texbox2 ==> same adreesses

        // primitve, reference data

        texBox2.setText("Hello world"); // userInput : "Hello world"

//        System.out.println(textBox1.userInput + texBox2.userInput);

        var employee1 = new Employee(50000, 500);
        int salary   = employee1.calculateSalary(4);
        System.out.println(salary);
//        System.out.println(employee1Salary);
//
//        greetUser("raju");

    }

    // garbage collector --> watching on heap memory, if there is any unused object then it will remove form the heap.

    // heap --->  objects stored --->

    // stack --->

    // primitives and temporary variables
    // variables that store references to objects on heap

    // memory de allocation

//    String name1 = new String("hello")

//    String name2 = name1;

    // strings are immutable -- reference data types

    //method overloading ---> we need different implementations for our methods with different parameters










    public static String getFullName(String firstName, String lastName){ // method declaration
        String fullName = firstName +" " + lastName ;
        return fullName;
    }

}
