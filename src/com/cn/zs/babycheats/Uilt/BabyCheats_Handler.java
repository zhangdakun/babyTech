// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.cn.zs.babycheats.Uilt;

import com.cn.zs.babycheats.Bean.BabyCheats;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BabyCheats_Handler extends DefaultHandler
{

    public BabyCheats_Handler(List list, String s)
    {
        dirname = null;
        tagName = null;
        addDateCount = 0;
        setDateState = false;
        addDateState = false;
        startRead = false;
        loseWeightInfo = list;
        dirname = s;
    }

    public void characters(char ac[], int i, int j)
        throws SAXException
    {
        if(tagName.equals("name"))
            loseWeightInfo.add(loseWeight);
    }

    public void endDocument()
        throws SAXException
    {
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if(addDateState)
            addDateCount = -1 + addDateCount;
//        if(addDateCount != 1) goto _L2; else goto _L1
//_L1:
//        if(s1.equals("resource"))
//        {
//            loseWeightInfo.add(loseWeight);
//            setDateState = false;
//        }
//_L4:
//        tagName = "";
//        return;
//_L2:
//        if(addDateCount == 0)
//        {
//            startRead = false;
//            addDateState = false;
//            endDocument();
//        }
//        if(true) goto _L4; else goto _L3
//_L3:
        
        if(addDateCount == 1) {
        	if(s1.equals("resource")) {
              loseWeightInfo.add(loseWeight);
              setDateState = false;
        	}
        } else {
          if(addDateCount == 0)
          {
              startRead = false;
              addDateState = false;
              endDocument();
          }
        }
        tagName = "";
    }

    public BabyCheats getLoseWeight()
    {
        return loseWeight;
    }

    public List getLoseWeightInfo()
    {
        return loseWeightInfo;
    }

    public void setLoseWeight(BabyCheats babycheats)
    {
        loseWeight = babycheats;
    }

    public void setLoseWeightInfo(List list)
    {
        loseWeightInfo = list;
    }

    public void startDocument()
        throws SAXException
    {
        super.startDocument();
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        tagName = s1;
//        if(!attributes.getValue("name").equals(dirname)) goto _L2; else goto _L1
//_L1:
//        addDateCount = 1 + addDateCount;
//        startRead = true;
//        addDateState = true;
//_L4:
//        return;
//_L2:
//        if(startRead)
//        {
//            if(addDateState)
//                addDateCount = 1 + addDateCount;
//            if(addDateCount == 2 && !setDateState)
//            {
//                loseWeight = new BabyCheats();
//                loseWeight.setName(attributes.getValue("name"));
//                loseWeight.setFile(attributes.getValue("file"));
//                loseWeight.setTagname(attributes.getValue("tagname"));
//                setDateState = true;
//            }
//        }
//        if(true) goto _L4; else goto _L3
//_L3:
        if(attributes.getValue("name").equals(dirname)) {
          addDateCount = 1 + addDateCount;
          startRead = true;
          addDateState = true;       	
        } else {
          if(startRead)
          {
              if(addDateState)
                  addDateCount = 1 + addDateCount;
              if(addDateCount == 2 && !setDateState)
              {
                  loseWeight = new BabyCheats();
                  loseWeight.setName(attributes.getValue("name"));
                  loseWeight.setFile(attributes.getValue("file"));
                  loseWeight.setTagname(attributes.getValue("tagname"));
                  setDateState = true;
              }
          }       	
        }
    }

    private int addDateCount;
    private boolean addDateState;
    private String dirname;
    private BabyCheats loseWeight;
    private List loseWeightInfo;
    private boolean setDateState;
    private boolean startRead;
    private String tagName;
}
