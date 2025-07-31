import java.io.IOException;

public class Account {
    private float balance;
//    private String name = "";

////    name
//    "".re

    // Numbers 0, string = "" null, boolean false
    public void deposit(float value) throws IOException {
        if(value <= 0)
            throw new IOException();

//        logic to store this data in database - defensive programming
        System.out.println("Amount deposited");
    }

    public void withDraw(float value) throws InSufficientBalanceException {
        if(value > balance){
            throw new InSufficientBalanceException("Insufficient balance found. ");
        }
    }

    // generic exception

    // AccountException
//    ---> InSufficientBalanceException, UnderMaintainanceException, ServerDownException

    // chaining exceptions

    // custom exceptions-->

    // checked, unchecked --->

    // checked --> extends Exception
    // unchecked --> unchecked --> RunTimeException -> Exception
// unchecked exception should extend RunTimeException

    // custom exceptions --->

    // IllegalArgumentException - run time exception - uncehcked exception
    // checked exception --> FileNotFound, IOException
    //


}

// throw - used to throw an exception
// throw exception -->

// java exceptions -->