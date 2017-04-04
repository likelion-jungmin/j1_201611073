package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class BabyTurtle extends Observable {
  Turtle baby;
  ArrayList<Observer> obs;
  Double myCurpos;
  public BabyTurtle() {
    baby= new Turtle();
    obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o) {
    obs.add(o);
  }
  public void notifyObserver() {
    for(Observer o:obs)
      o.update(this, 1);
  }
  protected void setChange() {
    myCurpos=baby.getPos();
  }
  public void move(int x, int y) {
    baby.moveTo(x,y);
  }
}