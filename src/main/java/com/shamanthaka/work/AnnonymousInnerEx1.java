package com.shamanthaka.work;

class Flavor1Demo {
    void show() {
        System.out.println("i am in show method of super class");
    }
}


public class AnnonymousInnerEx1 {



    public void annoymousMethod(){
        //  An anonymous class with Demo as base class
        Flavor1Demo d = new Flavor1Demo() {
            void show() {
                super.show();
                System.out.println("i am in Flavor1Demo class");
            }
        };
        d.show();
    }

    /*public static void main(String[] args){
        d.show();
    }*/
}
