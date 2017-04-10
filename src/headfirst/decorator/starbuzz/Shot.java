package headfirst.decorator.starbuzz;

public class Shot extends CondimentDecorator {
  Beverage beverage;
  public Shot(Beverage b) {
    this.beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription()+"adding Shot ";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}