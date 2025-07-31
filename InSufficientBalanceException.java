
public class InSufficientBalanceException extends Exception{

    public InSufficientBalanceException(){
        System.out.println("Insufficient funds in your Account");
    }

    public InSufficientBalanceException(String message){
        super(message); // it calls the constructor of its parent(Exception)
        // this --- current class , super ---> parent class
    }
}


//new InSufficientBalanceException("Insufficient balance.please try with different amount")

//new InSufficientBalanceException()