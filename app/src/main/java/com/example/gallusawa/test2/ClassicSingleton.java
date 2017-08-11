package com.example.gallusawa.test2;

import android.content.Context;

/**
 * Created by gallusawa on 8/11/17.
 */

public class ClassicSingleton {

    private Context context;

    private static ClassicSingleton instance = null;

    public ClassicSingleton(Context context) {
        this.context = context;
    }

    public ClassicSingleton(){

    }

    public static ClassicSingleton getInstance(Context context) {

        if (instance == null) {
            instance = new ClassicSingleton(context);
        }
        return instance;

    }

}