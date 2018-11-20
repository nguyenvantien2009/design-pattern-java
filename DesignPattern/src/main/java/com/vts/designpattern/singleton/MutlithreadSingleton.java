/* 
 * Copyright 2018, VTS Space, http://vtsspace.com.
 * 
 * This software is released under the terms of the
 * GNU LGPL license. See http://www.gnu.org/licenses/lgpl.html
 * for more information.
 * 
 */
package com.vts.designpattern.singleton;

import java.util.UUID;

/**
 * Use Singleton in Multiple Thread.
 *
 * @author Neit Ng (Enit Ng: http://nguyenvantien2009.com)
 */
public class MutlithreadSingleton {

    /**
     * Instance of this class.
     */
    private static MutlithreadSingleton instance;

    /**
     * Use static function to get instance class. Need check if instance
     * created, we will re-use.
     *
     * @return Instance of class.
     */
    public static MutlithreadSingleton getInstance() {
        return instance != null ? instance : createInstance();
    }

    /**
     * Use synchronized to protect have a lot of thread create instance when
     * instance not enough time to create.
     *
     * @return Instance of class.
     */
    private static synchronized MutlithreadSingleton createInstance() {
        if (instance == null) {
            instance = new MutlithreadSingleton();
        }
        return instance;
    }

    /**
     * Id of instance.
     */
    private String id;

    /**
     * Default construct with random ID by UUID.
     */
    public MutlithreadSingleton() {
        this.id = UUID.randomUUID().toString();
    }

    /**
     * get ID.
     *
     * @return Id of instance.
     */
    public String getId() {
        return id;
    }

    /**
     * set Id.
     *
     * @param id Id name.
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MutlithreadSingleton{" + "id=" + id + '}';
    }

}
