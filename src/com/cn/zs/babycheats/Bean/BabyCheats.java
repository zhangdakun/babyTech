// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.Bean;

import java.io.Serializable;

public class BabyCheats
    implements Serializable
{

    public BabyCheats()
    {
    }

    public BabyCheats(String s, String s1, String s2)
    {
        name = s;
        file = s1;
        tagname = s2;
    }

    public static long getSerialVersionUID()
    {
        return 1L;
    }

    public String getFile()
    {
        return file;
    }

    public String getName()
    {
        return name;
    }

    public String getTagname()
    {
        return tagname;
    }

    public void setFile(String s)
    {
        file = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTagname(String s)
    {
        tagname = s;
    }

    private static final long serialVersionUID = 1L;
    private String file;
    private String name;
    private String tagname;
}
