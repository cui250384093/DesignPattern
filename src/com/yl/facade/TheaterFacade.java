package com.yl.facade;


/**
 * @author candk
 * @Description
 * @date 4/26/21 - 10:02 AM
 */
public class TheaterFacade {

    private DVDPlayer dvdPlayer;
    private Light light;
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;

    public TheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        dvdPlayer.on();
        light.dim();
        screen.down();
        stereo.on();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        dvdPlayer.on();
        light.bright();
        screen.up();
        stereo.off();
    }
}
