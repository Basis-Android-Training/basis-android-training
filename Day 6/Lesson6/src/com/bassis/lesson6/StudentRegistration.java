
package com.bassis.lesson6;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StudentRegistration extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.student_registration, menu);
        return true;
    }

}
