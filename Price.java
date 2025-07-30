public class Price implements CanPrice {
    private int price ;


    public Price(int price){
        this.price = price;
    }



@Override
    public int getPrice(int offer){
        return price - offer;
    }
}


// constructor, setter