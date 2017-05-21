package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;
public abstract class Pizza {
  String name;
  Dough dough;
  String sauce;
  Cheese cheese; 
  ArrayList<String> toppings=new ArrayList<String>();
  abstract void prepare();
  public void bake() {
    System.out.println("backing "+name);
  }
  public void cut() {
    System.out.println("cutting "+name);
  }
  public void box() {
    System.out.println("boxing "+name);
  }
  public String toString() {
  StringBuffer display = new StringBuffer();
  display.append("---- " + name + " ----\n");
  display.append(dough + "\n");
  display.append(sauce + "\n");
  for (int i = 0; i < toppings.size(); i++) {
   display.append((String )toppings.get(i) + "\n");
  }
  return display.toString();
 }
}