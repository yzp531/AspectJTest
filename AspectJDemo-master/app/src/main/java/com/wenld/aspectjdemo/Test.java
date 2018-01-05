package com.wenld.aspectjdemo;

import android.util.Log;

/**
 * Created by wenld on 2017/3/7.
 */

public abstract class Test {
    public void method(){
        Log.e("childMethod","before...");
<<<<<<< HEAD
        //1112222222
=======
        //111wwwwww
>>>>>>> master
        childMethod();

        Log.e("childMethod","after...");
    }
    abstract void childMethod();
}
