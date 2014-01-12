
package com.basis.gridviewtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Luancher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luancher);
        gotoStartUpActivity();
    }

    private void gotoStartUpActivity() {
        // finish();
        Intent intent = new Intent(this, CustomAdapterGridView.class);
        startActivity(intent);
        finish();
    }

}
