import java.util.Iterator;

public class GenericList <T> implements Iterable<T> {

    // we can extends interface

    // Comparable, cloneable --> Comparable --> to compare two objects

//    new T()
//    private length
//
//    public GenericList (int length){
//        this.length = length;
//
//    }
    // Iterable --> iterator() return type - Iterator --> hasNext(), next()

    // collection - capabalities --
    // we should be able to add elements to collection -
//    we should be able to remove elements to collection
    // we should be able to check the elements in collection



    private T[] items = (T[]) new Object[10];
    private int count = 0;


    public void add(T item ){
        items[count++] = item;

    }
    public T get(int index ){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }
//
    private class ListIterator implements  Iterator<T>{

        private GenericList<T> list;
        private int index;

    // ListIterator - to iterate the elements --> list

    public ListIterator(GenericList<T> list){
        this.list = list;
    }

//    ["a", "b", "c"] --->

//    list.add("a") - 0 ---> 1
//    list.add("b")  1 ---> 2
//    list.add("c") 2 ---> 3

//    3 < 3

    @Override
    public boolean hasNext() {
        return (index < list.count);
    }


    @Override
    public T next() {
        return list.items[index++];
    }
}

//    public class List

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

