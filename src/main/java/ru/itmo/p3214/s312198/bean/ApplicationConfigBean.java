package ru.itmo.p3214.s312198.bean;

import java.util.ArrayList;

/**
 * Application configuration storage.
 * Hold all limits for metrics (x, y, r)
 */
public class ApplicationConfigBean {
    private ArrayList<Double> xValues = new ArrayList<>();
    private ArrayList<Integer> yValues = new ArrayList<>();
    private ArrayList<Double> rValues = new ArrayList<>();

    public ApplicationConfigBean() {
        yValues.add(-4);
        yValues.add(-3);
        yValues.add(-2);
        yValues.add(-1);
        yValues.add(0);
        yValues.add(1);
        yValues.add(2);
        yValues.add(3);
        yValues.add(4);

        rValues.add(1d);
        rValues.add(1.5d);
        rValues.add(2d);
        rValues.add(2.5d);
        rValues.add(3d);
    }

    public ArrayList<Double> getxValues() {
        return xValues;
    }

    public void setxValues(ArrayList<Double> xValues) {
        this.xValues = xValues;
    }

    public ArrayList<Integer> getyValues() {
        return yValues;
    }

    public void setyValues(ArrayList<Integer> yValues) {
        this.yValues = yValues;
    }

    public ArrayList<Double> getrValues() {
        return rValues;
    }

    public void setrValues(ArrayList<Double> rValues) {
        this.rValues = rValues;
    }
}
