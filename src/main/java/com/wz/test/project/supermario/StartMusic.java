package com.wz.test.project.supermario;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.util.TimerTask;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 11:37
 */
public class StartMusic extends TimerTask {

    private String music;

    public StartMusic() {
    }

    public StartMusic(String music) {
        this.music = music;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(Thread.currentThread().getContextClassLoader().getResourceAsStream("拖鞋pd-请先说你好.mp3"));
            Player player = new Player(bis);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
