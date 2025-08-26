public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

//    private

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

//    public String getName() {
//        return name;
//    }

// current < 0ther --> return -1
    // current == 0ther  --> return 0
    // current > 0ther  ---> return 1

    // in strings we have compareTo --> it is already implementing comparable interface

// comparable, comparator interface --> sort the elements in collection.

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }



}


//customer name

// var customerObj = new Customer(); // you cant create a insta
// customerObj.email





// comparable interface --> will allow us to compare the objects

// comparator
