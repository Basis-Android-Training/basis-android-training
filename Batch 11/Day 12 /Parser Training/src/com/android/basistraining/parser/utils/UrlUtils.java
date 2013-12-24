
package com.android.basistraining.parser.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlUtils {

    public static String getResponse(String url) {

        try {

            URL httpUrl = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) httpUrl.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;

        /*
         * Ê Êtry { Ê Ê ÊInputStream in = new
         * BufferedInputStream(urlConnection.getInputStream()); Ê Ê Ê return
         * readStream(in); Ê Ê }catch(Exception ex){ } finally { Ê Ê
         * ÊurlConnection.disconnect(); Ê }
         */

    }

    private String readStream(InputStream in) throws IOException {

        StringBuilder sb = new StringBuilder(Math.max(16, in.available()));
        char[] tmp = new char[4096];

        InputStreamReader reader = new InputStreamReader(in);
        for (int cnt; (cnt = reader.read(tmp)) > 0;)
            sb.append(tmp, 0, cnt);
        in.close();

        return sb.toString();
    }

}
