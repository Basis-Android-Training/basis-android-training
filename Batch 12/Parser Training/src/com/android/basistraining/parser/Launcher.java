
package com.android.basistraining.parser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoXmlParser();
    }

    private void gotoJsonParser() {

        Intent intent = new Intent(this, JsonParserActivity.class);
        startActivity(intent);
        finish();
    }

    private void gotoXmlParser() {

        Intent intent = new Intent(this, XmlParserActivity.class);
        startActivity(intent);
        finish();
    }

}
