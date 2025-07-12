public class Title extends Product {
    @Override
    public void render(String name, int num) {
        System.out.println("render title"+ name + " " + num);
    }
}
