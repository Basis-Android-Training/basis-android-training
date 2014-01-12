
package com.android.basistraining.parser.utils;

import java.io.StringReader;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.util.Log;

import com.android.basistraining.parser.entity.AndroidHiveBean;

public class XMlUtils {

    public static String basicXmlparsing() {

        try {

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();

            xpp.setInput(new StringReader("<foo>Hello World!</foo>"));
            int eventType = xpp.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                if (eventType == XmlPullParser.START_DOCUMENT) {
                    Log.d("XMlUtils", "Start document");
                } else if (eventType == XmlPullParser.START_TAG) {
                    Log.d("XMlUtils", "Start tag " + xpp.getName());
                } else if (eventType == XmlPullParser.END_TAG) {
                    Log.d("XMlUtils", "End tag " + xpp.getName());
                } else if (eventType == XmlPullParser.TEXT) {
                    Log.d("XMlUtils", "Text " + xpp.getText());
                }
                eventType = xpp.next();
            }
            Log.d("XMlUtils", "End document");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static List<AndroidHiveBean> parseAndroidHiveUrl() {
        String url = "http://api.androidhive.info/pizza/?format=xml";

        return null;
    }

}
