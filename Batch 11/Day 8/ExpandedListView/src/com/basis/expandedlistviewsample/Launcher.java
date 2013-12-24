package com.basis.expandedlistviewsample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank);
        gotoStartUpActivity();
    }
    
    private void gotoStartUpActivity(){
        Intent intent = new Intent(getApplicationContext(),NormalExpandableList.class);
        startActivity(intent);
        finish();
    }
    
}
