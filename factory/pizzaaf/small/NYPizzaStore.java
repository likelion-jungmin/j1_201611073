package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza=null;
    Pizza pizza2=null;
    PizzaIngredientFactory inFac=new NYPizzaIngredientFactory();
    PizzaIngredientFactory inFac2=new PotatoPizzaIngredientFactory();
 
    if(type.equals("cheese")) {
      //pizza=new NYStyleCheesePizza();
      pizza=new CheesePizza(inFac);
    }
    else if(type.equals("totato")) {
      pizza2=new PotatoPizza(inFac2);
    }
    return pizza;
  } 
}