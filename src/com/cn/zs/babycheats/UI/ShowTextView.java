// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.UI;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
//import com.feiwo.banner.AdBanner;
//import com.feiwo.banner.RecevieAdListener;
import java.io.IOException;
import java.io.InputStream;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.ADbaseActivity;
import com.cn.myandroid.mybabyp.R;

public class ShowTextView extends ADbaseActivity
{

    public ShowTextView()
    {
        appKey = "awV5ugVtGH0QTDuPJ9WOx7v1";
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        super.onCreate(bundle);
        setContentView(0x7f030003);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        Intent intent = getIntent();
        s = intent.getStringExtra("FILEPATH");
        String s1 = intent.getStringExtra("TXTTITLE");
        title = (TextView)findViewById(0x7f050008);
        title.setText(s1);
        byte abyte0[];
        InputStream inputstream;
        Display display;
		try {
			inputstream = getAssets().open((new StringBuilder("txt/")).append(s).toString());

        abyte0 = new byte[inputstream.available()];
        inputstream.read(abyte0);
        inputstream.close();
        String s2 = new String(abyte0, "GB2312");
        String s3 = s2.replace("\r\n", "\n");
        IOException ioexception;
        
//        AdBanner adbanner;
//        RecevieAdListener recevieadlistener;

            ((TextView)findViewById(0x7f050009)).setText(s3);
        }
        catch(Exception exception1) { }
//_L2:
        display = getWindowManager().getDefaultDisplay();
        myAdonContainerView = (RelativeLayout)findViewById(0x7f050004);
//        adbanner = new AdBanner(this, Math.min(display.getWidth(), display.getHeight()), 10);
//        myAdView = adbanner;
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner1)
//            {
//                myAdonContainerView.setVisibility(8);
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner1)
//            {
//                myAdonContainerView.setVisibility(0);
//            }
//
//            final ShowTextView this$0;
//
//            
//            {
//                this$0 = ShowTextView.this;
//                super();
//            }
//        }
//;
//        myAdView.setRecevieAdListener(recevieadlistener);
//        return;
//        ioexception;
//        RuntimeException runtimeexception = new RuntimeException(ioexception);
//        throw runtimeexception;
//        Exception exception;
//        exception;
//        if(true) goto _L2; else goto _L1
//_L1:
    }

    private String appKey;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;
    private TextView title;

}
