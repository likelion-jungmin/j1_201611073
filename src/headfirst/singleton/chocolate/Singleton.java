package headfirst.singleton.chocolate;

public class Singleton {
 private static Singleton uniqueInstance;
    private static int numCalled=0;
 private Singleton() {}
 
 public static Singleton getInstance() {
  if (uniqueInstance == null) {
   uniqueInstance = new Singleton();
  }
               
  System.out.println("numCalled: "+numCalled++);
  return uniqueInstance;
 }
}