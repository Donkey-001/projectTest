package com.wz.test.project.supermario;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 10:40
 */
public abstract class Enery {

    public int x,y;
    public int width,height;
    public Image img;
    public Enery(int x, int y, int width, int height,Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.img=img;
    }

}
