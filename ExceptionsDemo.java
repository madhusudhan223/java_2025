import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException{

    var account = new Account();
    try{
        account.withDraw(200);
    }catch (AccountsException ex){
        System.out.println("Something went wrong. pls try after sometime");
//        var cause = ex.getCause();
//        System.out.println(cause);
//        ex.printStackTrace();
//        System.out.println(ex.getMessage());

    }

    // chaining exceptions --->

//    try{
//     account.deposit(-20);
//    }catch (IOException ex){
//        throw ex;
//    }

        // multiple catching
        // rethrowing an exception

        // finally keyword --> finally block
//        FileReader reader = null;

//        try with resource statement - it will provide finally block by default for us & explicitly closes the reader close

//        try(
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("...");
//        ) {
//
//        }

        //



        // chaining - exception -->
        //
//        try(var reader = new FileReader("file.txt")){
////             reader = new FileReader("file.txt");
////            FileReader reader = new FileReader();
//            var value = reader.read();
////            new SimpleDateFormat().parse("");
//            System.out.println("File read");

        // File not exception
//        }
//        catch (IOException ex){
//            System.out.println("Unable to read the file ");
//        }
        // finally block will be provided by java by default
//        finally {
////            reader.close();
////            if(reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
////            }
//        }

        // prevents the crash of our application
        // when Exception or error occured we can show meaningful message to user

//        catch (ParseException ex){
//            System.out.println("Unable to Parse the data ");
//        }

//        catch(IOException | ParseException ex ){
//            System.out.println("something went wrong. please try later");
//            System.out.println(ex.getMessage());
//        }
//        catch (FileNotFoundException ex){
//            System.out.println("File not found");
//        }



//        sayHello(null);


    }
    public static void sayHello(String name){

        System.out.println("hello" +" " + name.toUpperCase());
    }
}

// null pointer exception --> is an example for runtime exception

// try {

// }catch(){
// }



// exceptions --> errors are represented with exceptions

//Exception
// checked exception --> occured during compilation time --> FileNotFound exception

// unchecked exception ---> runtime exception -- Runt

//Exception
//RuntimeException
// NullPointerException
// Arithmetic Exception --> divide any value by 0
// IllegalArgumentException --> the argument we passed to method is not accepted
// IndexOutOfBoundsException --> ex : Array has 5 elements if we try to access 10th element
// IllegalStateException -> if we try to call a method but the object not in right state.

////var names = new Array(5)
//array[5]--> array [10]

// Error -->  ex: stack overflow error, out of memory error
