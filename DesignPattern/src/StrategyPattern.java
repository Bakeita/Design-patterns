
// Not Every Duck can Fly nor to Quack. Example RubberDuck can't Fly
interface FlyBehavior{
    void fly();
}
interface QuackBehavior{
    void quack();
}
// Different Fly Behavior
class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I believe i can fly");
    }

}
class FlyNoWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I cannot fly");
    }
}
// Different quack behavior
class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can Quack");
    }
}

class Speak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can speak");
    }
}

class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}

// Method that stay the same are inside an abstract class called Duck
abstract class Duck{
   protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected void swim() {
        System.out.println("Everything duck can swim");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
    // Every Duck is responsible for implementing the display method due dissimiliratie among ducks
    abstract public void display();
}
 class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior  = new Speak();
        flyBehavior  = new FlyNoWings();

    }
    public void display(){
        System.out.println("I am a RubberDuck , i can speak but i can't fly");
    }

}
public class StrategyPattern {
    public static void main(String[] args){
       Duck duck = new RubberDuck();
       duck.performFly();
       duck.performQuack();
    }
}
