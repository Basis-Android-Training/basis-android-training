
package com.basis.spinnertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoNextActivity();
    }

    private void gotoNextActivity() {
        Intent intent = new Intent(this, DoubleSpinnerActivity.class);
        startActivity(intent);
        finish();
    }
}
