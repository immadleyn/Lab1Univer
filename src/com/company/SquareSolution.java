package com.company;

/**
 * Created by Student on 05.09.2017.
 */
public class SquareSolution {
    private double a;
    private double b;
    private double c;

    private double res1;
    private double res2;

    private boolean withoutSquare = false;
    private boolean dEqualsZero = false;


    public SquareSolution(double a , double b , double c){
        setA(a);
        setB(b);
        setC(c);
        count();
    }

    public void count(){
        double d = 0;
        d = Math.pow(getB(),2) - 4 * getA() * getC();
        if (d == 0){
            res1 = - getB() / 2 * getA();
            dEqualsZero = true;
        } else if(d < 0){
            withoutSquare = true;
        } else {
            res1 = (- getB() + d ) / 2 * getA();
            res2 = (- getB() - d ) / 2 * getA();
        }
    }

    @Override
    public String toString() {
        if (dEqualsZero){
            return "The discriminant is zero. Root is " + res1 ;
        } else if(withoutSquare){
            return "No roots." ;
        } else {
            return "The discriminant > 0. First Root = " + res1 + " Second Root = " + res2 ;
        }
    }

    public double getRes1() {
        return res1;
    }

    public void setRes1(double res1) {
        this.res1 = res1;
    }

    public double getRes2() {
        return res2;
    }

    public void setRes2(double res2) {
        this.res2 = res2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
