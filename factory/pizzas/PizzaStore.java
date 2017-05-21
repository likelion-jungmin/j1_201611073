package headfirst.factory.pizzas;
//import headfirst.factory.pizzas.Pizza;

public class PizzaStore {
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza=factory.createPizza(type); //factory의 특징을 보여준다
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}