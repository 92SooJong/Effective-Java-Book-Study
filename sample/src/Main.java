import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(APPLE.FUJI.getName());
        System.out.println(APPLE.PIPPIN.getName());
        System.out.println(APPLE.PIPPIN);


    }

}


//class APPLE{
//    public static final APPLE FUJI = new APPLE();
//    public static final APPLE PIPPIN = new APPLE();
//}

//class ORANGE{
//    public static final ORANGE FUJI = new ORANGE();
//    public static final ORANGE PIPPIN = new ORANGE();
//}

enum APPLE{
    FUJI("fuji"),
    PIPPIN("pippin");

    private final String name;
    APPLE(String a){
        this.name = a;
    }

    String getName(){
        return this.name;
    }

}

