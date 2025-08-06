public class GenericList <T extends Comparable & Cloneable> {

    // we can extends interface

    // Comparable, cloneable --> Comparable --> to compare two objects

//    new T()
    private T[] items = (T[]) new Object[10];
    private int count = 0;


    public void add(T item ){
        items[count++] = item;

    }
    public T get(int index ){
        return items[index];
    }

//    private T[]
}


// T --> type

// new GenericList<String>();



// public void myMethod(String name){
//
// }

// myMethod("raj");

// type erasure --

// java compiler will erases the type parameter and replace them with a class or interface depending on the constraint we applied
// when we have multiple interface constraints - java compiler replaces with the left most one

