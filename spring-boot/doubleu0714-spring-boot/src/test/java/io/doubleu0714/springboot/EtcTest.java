package io.doubleu0714.springboot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EtcTest {

    @Test
    public void instanceOfTest() {
        ClassA classA = new ClassA();
        ClassA classAB = new ClassB();
        ClassB classB = new ClassB();

        assertTrue(classA instanceof ClassA);
        assertFalse(classA instanceof ClassB);

        assertTrue(classAB instanceof ClassA);
        assertTrue(classAB instanceof ClassB);
        
        assertTrue(classB instanceof ClassA);
        assertTrue(classB instanceof ClassB);
    }
}

class ClassA {

}

class ClassB extends ClassA {

}