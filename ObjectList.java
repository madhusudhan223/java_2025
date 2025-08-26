import java.util.Comparator;

public class ObjectList {

    private Object [] items ;
    private int count = 0;

    public ObjectList(int arraySize){
        items =  new Object[arraySize];
    }

    public void add(Object item){
        items[count++] =  item;
    }

    public Object get(int index){
        return items[index];
    }

    public static class EmailComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer object1, Customer object2) {
            return object1.getEmail().compareTo(object2.getEmail());
        }
    }
}
