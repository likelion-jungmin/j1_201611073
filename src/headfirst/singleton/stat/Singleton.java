package headfirst.singleton.stat;

public class Singleton {
  //private volatile static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
 public static synchronized Singleton getInstance() {
  // public static Singleton getInstance() {
   //if (uniqueInstance == null) {
   // synchronized(Singleton.class) {
     // if(uniqueInstance==null) {
      //  System.out.println("creating...");
     //   uniqueInstance = new Singleton();
    //  }
  //  }
  //}
  //else {
  System.out.println("returning...");
  System.out.println("numCalled: "+numCalled++);
  return uniqueInstance;
  //}
 }
}