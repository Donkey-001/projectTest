package com.wz.text01.p1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/15
 * Time: 12:02
 */
public class Test02 {

    public static void main(String[] args) {
        TestProtected testProtected = new TestProtected();
        testProtected.show();
        TestDefault testDefault = new TestDefault();
        testDefault.show();

    }
}
