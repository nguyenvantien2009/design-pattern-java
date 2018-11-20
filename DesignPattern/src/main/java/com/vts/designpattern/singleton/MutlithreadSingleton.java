/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vts.designpattern.singleton;

import java.util.UUID;

/**
 *
 * @author Neit Ng
 */
public class MutlithreadSingleton {

    private static MutlithreadSingleton instance;

    public static MutlithreadSingleton getInstance() {
        return instance != null ? instance : createInstance();
    }

    private static synchronized MutlithreadSingleton createInstance() {
        if (instance == null) {
            instance = new MutlithreadSingleton();
        }
        return instance;
    }

    private String id;

    public MutlithreadSingleton() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MutlithreadSingleton{" + "id=" + id + '}';
    }

}
