
import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer object1, Customer object2) {
        return object1.getEmail().compareTo(object2.getEmail());
    }
}
