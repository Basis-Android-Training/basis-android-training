
package com.basis.mappractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoMapActivity();
    }

    private void gotoMapActivity() {
        Intent intent = new Intent(this, MapPracticeActivity.class);
        startActivity(intent);
        finish();
    }

}
