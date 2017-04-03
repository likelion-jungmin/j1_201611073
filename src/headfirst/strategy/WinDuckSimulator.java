package headfirst.strategy;

public class WinDuckSimulator {
  public static void main(String[] args) {
    Duck mallard=new MallardDuck();
    mallard.performFly();
  }
}