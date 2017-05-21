package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza {
public class PotatoPizza extends Pizza {  
  PizzaIngredientFactory inFac2;
  //public NYStyleCheesePizza() {
  public PotatoPizza(PizzaIngredientFactory inFac2) {
    name="Abstract Factory Potato Pizza";
    this.inFac2=inFac2;
  }
  void prepare() {
   System.out.println("preparing");
   dough=inFac2.createDough();
   potato=inFac2.createPotato();
 }
}