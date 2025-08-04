public class UserList {

    private User [] items ;
    private int count = 0;

    public UserList(int arraySize){
        items =  new User[arraySize];
    }

    public void add(User item){
        items[count++] =  item;
    }

    public User get(int index){
        return items[index];
    }
}
