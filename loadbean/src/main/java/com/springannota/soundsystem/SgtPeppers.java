package com.springannota.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Wangpl
 * Time 2018/8/28 21:49
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
