package com.assignment14.code2;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CDPlayer is playing.");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer is paused.");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer has been stopped.");
    }
}
