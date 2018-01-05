package com.wenld.aspectjdemo;

import android.util.Log;

/**
 * Created by wenld on 2017/3/7.
 */

public abstract class Test {
    public void method(){
        Log.e("childMethod","before...");
        //111wwwwww
        childMethod();
        //00000
        Log.e("childMethod","after...");
    }
    abstract void childMethod();
}
