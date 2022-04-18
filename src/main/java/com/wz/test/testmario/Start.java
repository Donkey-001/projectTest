package com.wz.test.testmario;

import com.wz.test.testmario.bgmusic.Music;
import com.wz.test.testmario.frame.MyFrame;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 15:40
 */
public class Start {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        Music music = new Music(new File("src/main/java/com/wz/test/testmario/music/Overworld.mp3"));
        music.start();
    }
}
