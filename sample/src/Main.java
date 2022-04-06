import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.createEngine();
        factory.sayHello();
    }
}
