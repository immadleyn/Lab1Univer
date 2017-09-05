package com.company;

import java.util.Arrays;

/**
 * Created by Student on 05.09.2017.
 */
public final class FoundationsOfLanguage {

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static float average(float first , float second , float third){
        return (first + second + third)/3;
    }

    public static float multiply(float first , float second , float third){
        return first * second * third;
    }

    public static float[] sort (float first , float second , float third){
        float[] arr = {first,second,third};
        Arrays.sort(arr);
        return arr;
    }
   // public static float taskFour (float first , float second , float third){

   // }
}

