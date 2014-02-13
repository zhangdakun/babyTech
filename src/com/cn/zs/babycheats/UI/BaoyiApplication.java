// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.UI;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class BaoyiApplication extends Application
{

    public BaoyiApplication()
    {
    }

    public static BaoyiApplication getInstance()
    {
        return instance;
    }

    public boolean isonline()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if(networkinfo != null && networkinfo.isAvailable())
            flag = true;
        else
            flag = false;
        return flag;
    }

    public void onCreate()
    {
        super.onCreate();
        instance = this;
    }

    public static String TAG = "baoyi";
    private static BaoyiApplication instance;

}
