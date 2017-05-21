package headfirst.factory.pizzaaf.small;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Cheese createCheese();
  public Potato createPotato();
}