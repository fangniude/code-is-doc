package jvm;

/**
 * @author rd20
 */
public abstract class Animal implements Soundable {
    @Override
    public void sound() {
        Soundable.super.sound();
    }

    static void testStatic() {

    }
}
