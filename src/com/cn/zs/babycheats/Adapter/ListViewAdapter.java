// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.Adapter;

import android.content.Context;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.cn.zs.babycheats.Bean.BabyCheats;
import java.util.List;

public class ListViewAdapter extends BaseAdapter
{
    private class GridHolder
    {

        TextView appName;
//        final ListViewAdapter this$0;

//        private GridHolder()
//        {
//            this$0 = ListViewAdapter.this;
//            super();
//        }

//        GridHolder(GridHolder gridholder)
//        {
//            this();
//        }
    }


    public ListViewAdapter(Context context1)
    {
        babyCheatsInfo = null;
        context = context1;
    }

    public int getCount()
    {
        int i;
        if(babyCheatsInfo != null)
            i = babyCheatsInfo.size();
        else
            i = 0;
        return i;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        BabyCheats babycheats = (BabyCheats)babyCheatsInfo.get(i);
        GridHolder gridholder;
        if(view == null)
        {
            view = mInflater.inflate(0x7f030002, null);
            gridholder = new GridHolder();
            gridholder.appName = (TextView)view.findViewById(0x7f050007);
            gridholder.appName.setText(babycheats.getName());
            view.setTag(gridholder);
        } else
        {
            gridholder = (GridHolder)view.getTag();
        }
        if(babycheats != null)
            gridholder.appName.setText(babycheats.getName());
        return view;
    }

    public void setList(List list)
    {
        babyCheatsInfo = list;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    private List babyCheatsInfo;
    private Context context;
    private LayoutInflater mInflater;
}
