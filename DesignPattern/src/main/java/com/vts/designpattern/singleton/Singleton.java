/*
 * VTS Space Developer
 * Website: http://vtsspace.com
 */
package com.vts.designpattern.singleton;

import java.util.Date;

/**
 * Design Pattern with Singleton.
 *
 * @since 2018-11-20
 * @author Neit Ng
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Singleton{" + "created=" + created + '}';
    }

}
