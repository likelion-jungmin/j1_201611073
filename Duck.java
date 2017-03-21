package headfirst.strategy;

public abstract class Duck {
  public FlyBehavior fb;
  public void setFlyBehavior (FlyBehavior f) {
    this.fb=f;
  }
  public void performFly() {
    fb.fly();
    System.out.println("All ducks fly");
  }
  abstract void display();
  public void main() {
    System.out.println("All Ducks swimming..");
  }
}