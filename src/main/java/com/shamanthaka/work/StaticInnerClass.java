package com.shamanthaka.work;

public class StaticInnerClass {
//A static inner class in Java is a static member of an inner class, so technically they are not a Java inner class.


        private static void outerMethod()
        {
            System.out.println("inside outerMethod");
        }
        static class Inner
        {
            public static void main(String[] args)
            {
                System.out.println("inside inner class Method");
                outerMethod();
            }
        }
    }


