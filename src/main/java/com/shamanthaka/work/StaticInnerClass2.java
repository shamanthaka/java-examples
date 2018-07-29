package com.shamanthaka.work;

public class StaticInnerClass2 {
    // Java program to demonstrate accessing
// a static nested class

        static int outer_x = 10;


        int outer_y = 20;


        private static int outer_private = 30;


        static class StaticNestedClass
        {
            void display()
            {

                System.out.println("outer_x = " + outer_x);


                System.out.println("outer_private = " + outer_private);


            }
        }
    }


    class StaticNestedClassDemo
    {
        public static void main(String[] args)
        {

            StaticInnerClass2.StaticNestedClass nestedObject = new StaticInnerClass2.StaticNestedClass();

            nestedObject.display();

        }
    }


