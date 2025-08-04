public class List {
    private int [] items ;
    private int count = 0;

    public List(int arraySize){
        items =  new int[arraySize];
    }

    public void add(int item){
        items[count++] =  item;
    }

    public int get(int index){
        return items[index];
    }

}

// Object class - poor solution -- Strings, reference data primitives
// Generics --> which allows to store array of elements with different data types


// List -> it should allow user to store elements of any data type
//var list = new List(4);
//list.add(1);
//list.get(0);

// ++counts
// count++



// array of strings

// String[] names = {"Raj", "Ram", "charan"}

// String[] names = new String[10];
//names[0] = "Raj"

// var listItem = new List(5)

//listItem.add(9604); // 0 index
//listItem.add(3113); // 1 index

//listItem.get(1) // 3113
//listItem.get(0) // 9604
//

// i want to create array 10 elements
// i want to store the elements
// i should be able to get the elements

//generics --> All the collection class in java are implemented using genrics

// collections in java -- important

//