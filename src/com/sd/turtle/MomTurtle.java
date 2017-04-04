package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  public MomTurtle() {
    setColor(Color.red);
    label("Mom Turtle");
  }
  public void update(Observable o, Object arg) {
    babyCurpos=((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
  }
}