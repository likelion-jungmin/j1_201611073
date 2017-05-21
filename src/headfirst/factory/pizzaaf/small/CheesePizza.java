package headfirst.factory.pizzaaf.small;


//public class NYStyleCheesePizza extends Pizza {
public class CheesePizza extends Pizza {  
  PizzaIngredientFactory inFac;
  //public NYStyleCheesePizza() {
  public CheesePizza(PizzaIngredientFactory inFac) {
    name="Abstract Factory Cheese Pizza";
    this.inFac=inFac;
  }
  void prepare() {
   System.out.println("preparing");
   dough=inFac.createDough();
   cheese=inFac.createCheese();
 }
}