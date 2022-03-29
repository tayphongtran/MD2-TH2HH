package SoSanh;

import Hinhhoc.Circle;

public class CompareCircle extends Circle implements Comparable<CompareCircle> {
    public CompareCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public CompareCircle() {
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(CompareCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }else {
            if (getRadius() == o.getRadius()) return 0;
            else return -1;
        }
    }

}
