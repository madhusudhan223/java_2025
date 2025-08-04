public class AccountsException extends Exception{
    public AccountsException(){
//        super(cause);
    }
    public AccountsException(Exception cause){
        super(cause);
    }
}

// while creating generic exception we have to pass the cause (specific exception);


//AccountsException - generics

// now it can throw any specific exception -- InSufficientBalanceException, UnderMaintainanceException, ServerDownException
