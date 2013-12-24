
package com.basis.android.sensors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoSensorActivity();
    }

    private void gotoSensorActivity() {

        Intent intent = new Intent(this, AccelerometerTestActivity.class);
        startActivity(intent);
        finish();
    }
}
