package com.code.lambdaExpression;

public class LambdaMethodAndVariable {


//public void myLogic (String message){
//    System.out.println(message);
//}

    public LambdaMethodAndVariable(String message){
        System.out.println(message);
    }


    public static void showDemo(){
//            greet(new Printer() {
//                @Override
//                public void print(String message) {
//                    System.out.println(message);
//                }
//            });
//
//           String prefix = "++";

        // this --> in lambda expression reference to enclosing object.
        // this --> Anonymous inner class --> this will be referencing to instance of inner class.

        // lambda expression -> cannot have state(fields/variables)
        // anonymous inner class --> can have a state (fields/variables)



        // static method syntax
//           greet(message -> myLogic(message));
//           greet(LambdaMethodAndVariable::myLogic);



        // instance method syntax
//        var demo = new LambdaMethodAndVariable();
//        greet(message -> demo.myLogic(message) );
//        greet(demo::myLogic);


        // constructor syntax

//        greet(message -> new LambdaMethodAndVariable(message));
//        greet(LambdaMethodAndVariable::new);


//        greet(message -> System.out.println(message));
//        greet(System.out::println);


//            greet(message -> {
//                // mutliple code
//                //
//                //
//                System.out.println(message);
//            });
//

//            print();
//            println

//        class/object::method

        // static, instance, constructor.


            // method reference --> you can pass the method reference directly to lambda expression without calling



        }

        public static void greet(Printer printer){
            printer.print("Welcome !!");
        }

}
