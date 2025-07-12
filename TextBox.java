public class TextBox extends Product {
     private String userInput = "";

//     protected -->
      protected String userNumber =""; // public in their package --> be aware

//public  TextBox() {
////    super(true); // super will be always at top
//    System.out.println("hello");
//    // it calls contructor of parent class
// }

    @Override
    public void render(String name, int num) {

        System.out.println("Text box render" + name + " " + num );
    }

    @Override
    public boolean isEnabled() {
        System.out.println("overiding isEnabled method");
        return true ;
    }

    // @Override
// public String toString(){
//    return "overriding toString";
//
// }
// @Override


     public void setText( String text){
         this.userInput = text;
     }
     public void setText(int num){
         System.out.println(num);
     }
     public void clear(){
         this.userInput = "";
     }

     public String getUserInput(){
         return userInput;
     }

}
