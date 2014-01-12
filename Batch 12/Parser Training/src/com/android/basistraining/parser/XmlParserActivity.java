
package com.android.basistraining.parser;

import android.app.Activity;
import android.os.Bundle;

import com.android.basistraining.parser.utils.XMlUtils;

public class XmlParserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_parser);

        XMlUtils.basicXmlparsing();
    }

}
