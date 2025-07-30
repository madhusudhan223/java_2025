import java.io.IOException;

public class Account {

    public void deposit(float value) throws IOException {
        if(value <= 0)
            throw new IOException();

//        logic to store this data in database - defensive programming
        System.out.println("Amount deposited");
    }

    // IllegalArgumentException - run time exception - uncehcked exception
    // checked exception --> FileNotFound, IOException
    //


}

// throw - used to throw an exception
// throw exception -->

// java exceptions -->