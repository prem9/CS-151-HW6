package com.example;

import java.util.ArrayList;
import java.util.function.DoubleToLongFunction;

/**
 * Hello world!
 *
 */
public class MethodTest 
{
    private static <T> int count(ArrayList<T> list)
    {

        
        return list.size();
    }
 
    public static void main( String[] args )
    {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(0.0);
        doubleList.add(0.1);
        doubleList.add(0.2);
        doubleList.add(0.3);
        doubleList.add(0.4);
        doubleList.add(0.5);
        doubleList.add(0.6);
        doubleList.add(0.7);

        System.out.println(count(stringList));
        System.out.println(count(intList));
        System.out.println(count(doubleList));
        
    }
}   
