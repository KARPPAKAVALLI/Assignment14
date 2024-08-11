package com.assignment14.code2;

public class Main {
    public static void main(String[] args) {
        Playable p1=new MP3Player();
        p1.play();
        p1.pause();
        p1.stop();

        p1=new CDPlayer();
        p1.play();
        p1.pause();
        p1.stop();

        p1=new StreamingPlayer();
        p1.play();
        p1.pause();
        p1.stop();
    }
}
