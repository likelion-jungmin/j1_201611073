package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza=null;
    if(type.equals("cheese")) {
      pizza = new SMStyleCheesePizza();
   }
   return pizza;
  }
}