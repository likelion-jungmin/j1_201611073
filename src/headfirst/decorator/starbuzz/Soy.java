package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  public Soy(Beverage b) {
    this.beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription()+"adding Soy ";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}