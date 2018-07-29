package com.shamanthaka.work;

public class NestedInnerClass {
    class Inner
    {
        public void show()
        {
            System.out.println("nested class is available" );
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        NestedInnerClass.Inner in = new NestedInnerClass().new Inner();
        in.show();
    }
}

