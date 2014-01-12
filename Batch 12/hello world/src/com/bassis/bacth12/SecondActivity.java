
package com.bassis.bacth12;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    TextView txtExtraData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initilizeControls();
        loadData();
    }

    private void initilizeControls() {
        txtExtraData = (TextView) findViewById(R.id.txtExtraData);
    }

    private void loadData() {
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            txtExtraData.setText(extras.getString("first", "this is a ttest"));
        }
    }

}
