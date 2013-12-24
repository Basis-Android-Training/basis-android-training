
package com.bassis.taxcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Launcher extends Activity {
    EditText txtName, txtAddress;
    CheckBox chkRegularStudent;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        initializeControls();
        registerEvents();
        loadData();
    }

    private void initializeControls() {
        txtName = (EditText) findViewById(R.id.txtName);
        txtAddress = (EditText) findViewById(R.id.txtAdress);
        chkRegularStudent = (CheckBox) findViewById(R.id.chkRegularStudent);
        btnSave = (Button) findViewById(R.id.btnSave);
    }

    private void registerEvents() {
        btnSave.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button clicked", 3000).show();
                // Log.d(tag, msg)
            }
        });

    }

    private void loadData() {

    }

}
