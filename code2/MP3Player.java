package com.assignment14.code2;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3Player is playing.");
    }

    @Override
    public void pause() {
        System.out.println("MP3Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player has been stopped.");
    }
}
