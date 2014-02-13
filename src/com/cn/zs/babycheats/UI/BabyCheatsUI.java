// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.UI;

import com.android.adlib.ADbaseActivity;
import com.cn.myandroid.mybabyp.R;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
//import com.feiwo.banner.AdBanner;
//import com.feiwo.banner.RecevieAdListener;
//import com.snakemobi.sbs.Runner;

// Referenced classes of package com.cn.zs.babycheats.UI:
//            ListViewUI

public class BabyCheatsUI extends ADbaseActivity
{

    public BabyCheatsUI()
    {
        appKey = "awV5ugVtGH0QTDuPJ9WOx7v1";
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        
        AdManager.getInstance(this).init("156b7b56c53a1ee2",
        	    "217a8d5c4dadf905", false);
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        button1 = (ImageView)findViewById(0x7f050000);
        button2 = (ImageView)findViewById(0x7f050001);
        button3 = (ImageView)findViewById(0x7f050002);
        button4 = (ImageView)findViewById(0x7f050003);
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent(BabyCheatsUI.this, ListViewUI.class);
                intent.putExtra("NAME", "\u5582\u517B\u5065\u5EB7");
                startActivity(intent);
            }

//            final BabyCheatsUI this$0;
//
//            
//            {
//                this$0 = BabyCheatsUI.this;
//                super();
//            }
        }
);
        button2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent(BabyCheatsUI.this, ListViewUI.class);
                intent.putExtra("NAME", "\u5FC3\u7406\u884C\u4E3A");
                startActivity(intent);
            }

//            final BabyCheatsUI this$0;
//
//            
//            {
//                this$0 = BabyCheatsUI.this;
//                super();
//            }
        }
);
        button3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent(BabyCheatsUI.this, ListViewUI.class);
                intent.putExtra("NAME", "\u6E38\u620F\u73A9\u5177");
                startActivity(intent);
            }

//            final BabyCheatsUI this$0;
//
//            
//            {
//                this$0 = BabyCheatsUI.this;
//                super();
//            }
        }
);
        button4.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent(BabyCheatsUI.this, ListViewUI.class);
                intent.putExtra("NAME", "\u65E9\u6559\u6210\u957F");
                startActivity(intent);
            }

//            final BabyCheatsUI this$0;
//
//            
//            {
//                this$0 = BabyCheatsUI.this;
//                super();
//            }
        }
);
//        Runner.start(this);
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
//            final BabyCheatsUI this$0;
//
//            
//            {
//                this$0 = BabyCheatsUI.this;
//                super();
//            }
//        }
//;
//        myAdView.setRecevieAdListener(recevieadlistener);
    }

    private String appKey;
    private ImageView button1;
    private ImageView button2;
    private ImageView button3;
    private ImageView button4;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;

}
