public class Engine implements Factory{

    private Engine(){}

    static Factory getInstance() {
        System.out.println("Created Engine");
        return new Engine();
    }

    @Override
    public void sayHello() {
        System.out.println("hello I'm Engine");
    }
}
