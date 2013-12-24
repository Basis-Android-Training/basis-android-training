
package com.bassis.lesson6;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;

public class StudentRegistration extends Activity {

    Spinner spnGender;
    SeekBar skbAge;
    RatingBar rtbResult;
    Button btnSave;
    ProgressDialog progressBar;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);
        initializeControls();
        registerEvents();
        loadData();
    }

    private void initializeControls() {
        spnGender = (Spinner) findViewById(R.id.spnSex);
        skbAge = (SeekBar) findViewById(R.id.skbAge);
        rtbResult = (RatingBar) findViewById(R.id.rtbResult);
        btnSave = (Button) findViewById(R.id.btnSave);

        handler = new Handler();
    }

    private void registerEvents() {
        skbAge.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                showToast("on Stop ");
                showToast(" Preogress value " + seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                showToast("on Start ");

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showToast("on Progress ");

            }
        });

        btnSave.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                showProgressBar();
            }
        });

    }

    private void loadData() {
        loadSpinnerData();
    }

    private void populateRatingBar() {

    }

    private void loadSpinnerData() {
        List<String> list = new ArrayList<String>();
        list.add("Male");
        list.add("Female");
        list.add(" -none- ");
        ArrayAdapter<String> adpGender = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        adpGender.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        spnGender.setAdapter(adpGender);

    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, 2000).show();
    }

    private void submitData() {
        skbAge.getProgress();
    }

    private void showProgressBar() {
        progressBar = new ProgressDialog(this);
        progressBar.setCancelable(false);
        progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressBar.setMax(100);
        progressBar.setMessage("File downloading ...");
        progressBar.show();
        progressBar.setProgress(35);
    }

}
