
package com.bassis.bacth12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Luancher extends Activity {
    TextView txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luancher);
        gotoNextActivity();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /*
     * This method will move to the next activity
     */
    private void gotoNextActivity() {
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("first", "test");
        intent.putExtra("first1", 1);
        intent.putExtra("first2", true);
        intent.putExtra("first3", "aasdasdas");

        startActivity(intent);

    }

    private void initializeControls() {
        txtUserName = (TextView) findViewById(R.id.txtUserName);
        // 1
        // 2
        // 3
    }

    private void loadData() {
        txtUserName.setText("This is a test");

    }

}
