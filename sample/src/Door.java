public class Door implements Factory{

    private Door(){
    }

    public static Door getInstance(){
        System.out.println("created Door");
        return new Door();
    }

    @Override
    public void sayHello() {
        System.out.println("hello I'm Door");
    }
}
