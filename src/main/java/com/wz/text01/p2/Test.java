package com.wz.text01.p2;

import com.wz.text01.p1.TestProtected;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/15
 * Time: 11:55
 */
public class Test extends TestProtected {

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        System.out.println(test.name);
    }

}
