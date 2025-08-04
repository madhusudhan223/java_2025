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

}
