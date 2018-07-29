package com.shamanthaka.work;

import org.junit.Test;

public class NestedInnerClassTest {

    @Test
    public void innerTest(){
        NestedInnerClass.Inner inner = new NestedInnerClass().new Inner();

        inner.show();

        assert(true);
    }
}


