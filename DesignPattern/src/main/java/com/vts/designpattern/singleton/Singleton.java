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

/**
 * Design Pattern with Singleton.
 *
 * @since 2018-11-20
 * @author Neit Ng (Enit Ng: http://nguyenvantien2009.com)
 */
public class Singleton {

    /**
     * Singleton instance.
     */
    private static Singleton instance;

    /**
     * Static method to get instance of single Singleton.
     *
     * @return instance of class.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Created data of instance.
     */
    private Date created;

    /**
     * Get date.
     *
     * @return Date of instance.
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Set Date.
     *
     * @param created Date of instance.
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Singleton{" + "created=" + created + '}';
    }

}
