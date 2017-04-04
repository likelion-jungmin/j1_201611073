package com.sd.sort.v2;
import ch.aplu.turtle.*;
import com.sd.turtle.WeightTurtle;

import java.util.Comparator;
public class TurtleComparator implements Comparator<WeightTurtle> {
    public int compare(WeightTurtle t1, WeightTurtle t2) {
        return t1.getWeight()-t2.getWeight();
    }
}