
package com.basis.lesson5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class DoubleButton extends Activity implements OnClickListener {
    RadioButton rdoYes, rdoNo, rdoMayBe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_button);
        initilizeControls();
        registerEvents();
    }

    private void initilizeControls() {
        rdoYes = (RadioButton) findViewById(R.id.rdoYes);
        rdoNo = (RadioButton) findViewById(R.id.rdoNo);
        rdoMayBe = (RadioButton) findViewById(R.id.rdoMayBe);
    }

    private void registerEvents() {
        rdoYes.setOnClickListener(this);
        rdoNo.setOnClickListener(this);
        rdoMayBe.setOnClickListener(this);
    }

    private int onClick() {
        return 2;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rdoYes:
                showToast("Yes pressed");

                break;
            case R.id.rdoNo:
                showToast("No Pressed");
                break;
            case R.id.rdoMayBe:
                showToast("May be pressed");
                break;

            default:
                break;
        }
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, 2000).show();
    }

}
