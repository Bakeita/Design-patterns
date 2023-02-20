interface Shape{
    public void draw();
}

class Rectangle implements Shape{
    public Rectangle() {
    }

    public void draw(){

    }
}
class Circle implements Shape{
    public Circle() {
    }

    public void draw(){

    }
}
class Square implements Shape{
    public Square() {
    }

    public void draw(){

    }
}
class ShapeFactory {
    public Shape getShape(String shapes) {
        if (shapes == null) return null;
       if(shapes.equals("Circle")) return new Circle();
       else if(shapes.equals("Rectangle")) return new Rectangle();
       else return new Square();
    }
}
public class FactoryPatternDemo {
  public static void main(String arg){
      //
  }
}
