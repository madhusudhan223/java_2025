public class Item {
    private Price totalItemPrice;

//    public Item(Price price){
//        this.Price = price;
//    }


    public int itemPrice(Price price){
        var  itemPrice = price.getPrice(200);
        return itemPrice;
    }
}


// decouple them --> then only you have to use interfaces

// price --> interface --> item


// int,

// instance as parameter



//getPrice( Tax price)
