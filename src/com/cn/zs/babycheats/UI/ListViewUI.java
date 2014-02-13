// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.UI;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import com.android.adlib.AD;
import com.android.adlib.ADbaseActivity;
import com.cn.myandroid.mybabyp.R;
import com.cn.zs.babycheats.Adapter.ListViewAdapter;
import com.cn.zs.babycheats.Bean.BabyCheats;
import com.cn.zs.babycheats.Uilt.BabyCheats_Handler;
//import com.feiwo.banner.AdBanner;
//import com.feiwo.banner.RecevieAdListener;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import org.xml.sax.XMLReader;

// Referenced classes of package com.cn.zs.babycheats.UI:
//            ShowTextView

public class ListViewUI extends ADbaseActivity
{

    public ListViewUI()
    {
        babyCheatsInfo = null;
        babyCheats = null;
        listView = null;
        appKey = "awV5ugVtGH0QTDuPJ9WOx7v1";
    }

    private List parse(String s, String s1)
    {
        SAXParserFactory saxparserfactory = SAXParserFactory.newInstance();
        ArrayList arraylist = new ArrayList();
        try
        {
            java.io.InputStream inputstream;// = getClassLoader().getResourceAsStream(s);
            inputstream = this.getAssets().open(s);
            SAXParser saxparser = saxparserfactory.newSAXParser();
            XMLReader xmlreader = saxparser.getXMLReader();
            BabyCheats_Handler babycheats_handler = new BabyCheats_Handler(arraylist, s1);
            xmlreader.setContentHandler(babycheats_handler);
            saxparser.parse(inputstream, babycheats_handler);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return arraylist;
    }

    private void updateListView(String s)
    {
        updateListViewAdapter(s);
    }

    private void updateListViewAdapter(String s)
    {
        babyCheatsInfo = parse("BabyCheats.xml", s);
        ListViewAdapter listviewadapter = new ListViewAdapter(this);
        listviewadapter.setList(babyCheatsInfo);
        listView.setAdapter(listviewadapter);
    }

    Context context;
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030001);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        listView = (ListView)findViewById(0x7f050006);
        updateListView(getIntent().getStringExtra("NAME"));
        context = this;
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
            	if(i>20) {
            		if(!AD.i().haveOffers(context)) {
            			return;
            		}
            	}
                babyCheats = (BabyCheats)babyCheatsInfo.get(i);
                Intent intent = new Intent(ListViewUI.this, ShowTextView.class);
                intent.putExtra("FILEPATH", babyCheats.getFile());
                intent.putExtra("TXTTITLE", babyCheats.getName());
                startActivity(intent);
            }

//            final ListViewUI this$0;
//
//            
//            {
//                this$0 = ListViewUI.this;
//                super();
//            }
        }
);
        Display display = getWindowManager().getDefaultDisplay();
        myAdonContainerView = (RelativeLayout)findViewById(0x7f050004);
//        myAdView = new AdBanner(this, Math.min(display.getWidth(), display.getHeight()), 10);
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(8);
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(0);
//            }
//
//            final ListViewUI this$0;
//
//            
//            {
//                this$0 = ListViewUI.this;
//                super();
//            }
//        }
;
//        myAdView.setRecevieAdListener(recevieadlistener);
    }

    private String appKey;
    private BabyCheats babyCheats;
    private List babyCheatsInfo;
    private ListView listView;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;




}
