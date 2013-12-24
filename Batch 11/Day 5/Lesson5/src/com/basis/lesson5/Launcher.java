
package com.basis.lesson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoStartUpActivity();

    }

    private void gotoStartUpActivity() {
        Intent intent = new Intent(getApplicationContext(),
                com.basis.lesson5.DoubleButton.class);
        startActivity(intent);
        finish();
    }
}
