package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    fb=new FlyWithWings();
    //setFlyBehavior (new FlyWithWings());
  }
  public void display() {
    System.out.println("Mallard..");
  }
}