public abstract class Product {
     public boolean isEnabled;

     // default --> it will be public with in the package

    public void enable(){
        isEnabled = true;
    }

    public abstract void render(String name, int num);
//
//    public Product(boolean isEnable){
//        this.isEnabled = isEnable;
//    }
    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }


}
