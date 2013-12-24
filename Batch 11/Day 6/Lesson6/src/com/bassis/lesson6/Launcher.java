
package com.bassis.lesson6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        goToStartUpActivity();
    }

    private void goToStartUpActivity() {
        Intent intent = new Intent(getApplicationContext(),
                com.bassis.lesson6.StudentRegistration.class);
        startActivity(intent);
        finish();
    }

}
