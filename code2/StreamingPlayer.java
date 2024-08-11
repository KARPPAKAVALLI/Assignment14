package com.assignment14.code2;

public class StreamingPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("StreamingPlayer is playing.");
    }

    @Override
    public void pause() {
        System.out.println("StreamingPlayer is paused.");
    }

    @Override
    public void stop() {
        System.out.println("StreamingPlayerr has been stopped.");
    }
}
