/* 
 * Copyright 2018, VTS Space, http://vtsspace.com.
 * 
 * This software is released under the terms of the
 * GNU LGPL license. See http://www.gnu.org/licenses/lgpl.html
 * for more information.
 * 
 */
package com.vts.designpattern.singleton;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Call Singleton class with Single/ Multi. Use single thread for Singleton and
 * Multiple Thread for Multithread Singleton.
 *
 * @author Neit Ng (Enit Ng: http://nguyenvantien2009.com)
 */
public class Main {

    /**
     * Main function to call methods.
     *
     * @param args default of main class.
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        System.out.println("Test for Single Thread");
        main.runSingle();

        System.out.println("Test for Multi Thread");
        main.runMulti();
    }

    /**
     * Run singleton with multi thread.
     *
     * @throws InterruptedException when error from Thread
     */
    public void runMulti() throws InterruptedException {
        final Random r = new Random();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                long delay = r.nextInt((50 - 10) + 1);
                try {
                    Thread.sleep(delay);
                    MutlithreadSingleton obj = MutlithreadSingleton.getInstance();
                    System.err.println("UUUID of Object: " + obj.getId());
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();
        }
    }

    /**
     * Run singleton with Single Thread.
     *
     * @throws InterruptedException
     */
    public void runSingle() throws InterruptedException {
        Singleton obj1 = Singleton.getInstance();
        obj1.setCreated(new Date());
        System.out.println("Created object 1: " + obj1);

        Thread.sleep(2000L);
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Created object 2: " + obj2);
    }
}
