package com.yl.facade;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:48 AM
 */
public class Client {

    public static void main(String[] args) {
        TheaterFacade theaterFacade = new TheaterFacade();
        theaterFacade.end();
    }
}
