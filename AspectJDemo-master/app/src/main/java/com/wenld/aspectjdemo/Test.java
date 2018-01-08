package com.wenld.aspectjdemo;

import android.util.Log;

/**
 * Created by wenld on 2017/3/7.
 */

public abstract class Test {
    public void method(){
        Log.e("childMethod","before...");
        childMethod();


        //2
 
        //0

        Log.e("childMethod","after...");
    }
    abstract void childMethod();
}
