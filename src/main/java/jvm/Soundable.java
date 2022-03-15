package jvm;

/**
 * @author rd20
 */
public interface Soundable {
    default void sound() {
        soundInternal();
    }

    void soundInternal();

    static void testStatic() {

    }
}
