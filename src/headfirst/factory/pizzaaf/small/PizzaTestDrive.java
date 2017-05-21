package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza p =nyStore.orderPizza("cheese");
    Pizza p2 =nyStore.orderPizza("potato");
    //System.out.println(p.prepare());

  }
}