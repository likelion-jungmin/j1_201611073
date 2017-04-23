package headfirst.factory.pizzafm;

public class SMStyleCheesePizza extends Pizza {
  public SMStyleCheesePizza() {
    name="SM Style Sauce and Cheese Pizza";
    dough="Thin Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Potato");
    toppings.add("Beef");
  }
}