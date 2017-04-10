package headfirst.decorator.starbuzz;

public class caramelSyrup extends CondimentDecorator {
  Beverage beverage;
  public caramelSyrup(Beverage b) {
    this.beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription()+"adding caramelSyrup ";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}