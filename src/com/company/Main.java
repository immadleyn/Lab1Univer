package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(FoundationsOfLanguage.average(3,3,3));
        System.out.println(FoundationsOfLanguage.multiply(3,3,3));
        float[] arr = FoundationsOfLanguage.sort(3,6,-1);
        for(float t : arr){
            System.out.print(t + " ");
        }
        SquareSolution squareSolution = new SquareSolution(3,12,1);
        SquareSolution squareSolution1 = new SquareSolution(0,0,0);
        SquareSolution squareSolution2 = new SquareSolution(1 , 1 ,-8);
        System.out.println("---------------------------------------------------");
        System.out.println(squareSolution.toString());
        System.out.println(squareSolution1.toString());
        System.out.println(squareSolution2.toString());
    }
}
