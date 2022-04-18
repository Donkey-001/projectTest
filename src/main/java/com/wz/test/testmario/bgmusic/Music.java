package com.wz.test.testmario.bgmusic;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 15:14
 */
public class Music extends Thread {

    private File music;

    public Music() {
    }

    public Music(File music){
        this.music = music;
    }

    /**
     * 多线程
     */
    @Override
    public void run() {
       play();
    }

    /**
     * 播放方法
     */
    public void play()  {
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music));
            Player player = new Player(buffer);
            player.play();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
