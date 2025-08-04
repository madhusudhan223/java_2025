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

    public void withDraw(float value) throws AccountsException {
        if(value > balance){
//            var  funds = new InSufficientBalanceException("Insufficient balance found");
//            var accounts = new AccountsException();
//              accounts.initCause(funds);
            throw new AccountsException(new InSufficientBalanceException("Insufficient balance found. "));
//            throw new InSufficientBalanceException("Insufficient balance found. ");
        }
    }


    // Exception (checked, unchecked, Errors)
    // try/catch for handling exceptions
    // throw keyword --> throw, throws, Throwable( parent class of Exception)
    // custom exceptions
    // chaining of exceptions


    // generic exception
    // Accounts Exceptions -- generic

    // AccountException
//    ---> InSufficientBalanceException, UnderMaintainanceException, ServerDownException -- specific

    // chaining exceptions

//    Generic exception

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