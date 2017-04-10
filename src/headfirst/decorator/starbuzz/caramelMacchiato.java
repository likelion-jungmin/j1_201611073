package headfirst.decorator.starbuzz;

public class caramelMacchiato extends Beverage {
  public caramelMacchiato() {
    description = "caramel MacchiAto Coffee : ";  
  }
  public double cost() {
    return 0.8;
  }
}