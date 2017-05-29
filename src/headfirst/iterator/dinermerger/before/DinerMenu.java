package headfirst.iterator.dinermerger.before;

public class DinerMenu {
  MenuItem[] menuitems;
  static final int MAX_ITEMS=3;
  int numberofltems=0;
  public DinerMenu() {
    menuitems=new MenuItem[MAX_ITEMS];
    addItem("BLT", "Bacon, Lettuce, Tomato",true,2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem=new MenuItem(n,d,v,p);
    menuitems[numberofltems]=menuItem;
    //numberofltems++;
    numberofltems=numberofltems+1;
  }
  public MenuItem[] getMenuItems() {
    return menuitems;
  }
}