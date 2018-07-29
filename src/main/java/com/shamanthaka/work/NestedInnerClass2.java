package com.shamanthaka.work;

public class NestedInnerClass2 {
//Method Local Java Inner class/Java Local Class
    //A Method local inner class is a Java inner class defined within a method of an outer class in java.

        void outerMethod()
        {
            System.out.println("inside outerMethod");
            class Inner
            {
                void innerMethod()
                {
                    System.out.println("inside innerMethod");
                }
            }
            Inner y = new Inner();
            y.innerMethod();
        }
    }
    class MethodDemo
    {
        public static void main(String[] args)
        {
            NestedInnerClass2 x = new NestedInnerClass2();
            x.outerMethod();
        }
    }





