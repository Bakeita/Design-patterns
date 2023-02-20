class SingleObject{
    public static SingleObject instance = new SingleObject();
    private SingleObject(){

    }
    public void show(){
        System.out.println("Sike");
    }
    public static Object getInstance() {
        return instance;
    }
}

public class SingletonDemo {
    public static void main() {
        SingleObject object = (SingleObject) SingleObject.getInstance(); // need to be cast and it make sense
         object.show();
    }
}
