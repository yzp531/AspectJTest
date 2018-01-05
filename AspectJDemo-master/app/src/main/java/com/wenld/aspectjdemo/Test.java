package com.wenld.aspectjdemo;

import android.util.Log;

/**
 * Created by wenld on 2017/3/7.
 */

public abstract class Test {
    public void method(){
        Log.e("childMethod","before...");
        childMethod();
<<<<<<< HEAD
//1
=======
        //00000
>>>>>>> 4d8007ab069e28638b8b26b0f5a7e1d7c43d11c3
        Log.e("childMethod","after...");
    }
    abstract void childMethod();
}
