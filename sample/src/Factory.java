
interface Factory {

    static Factory createEngine(){
        return Engine.getInstance();
    }
    static Factory createDoor(){
        return Door.getInstance();
    }
    void sayHello();

}
