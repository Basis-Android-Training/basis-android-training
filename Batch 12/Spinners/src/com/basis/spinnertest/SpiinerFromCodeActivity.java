
package com.basis.spinnertest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpiinerFromCodeActivity extends Activity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiiner_from_code);
        initializeContorls();
        loadData();
    }

    private void initializeContorls() {
        spinner = (Spinner) findViewById(R.id.division_spinner);
    }

    private void loadData() {

        List<String> list = new ArrayList<String>();
        list.add("Dhaka");
        list.add("Rajshahi");
        list.add("Slyhet");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        // Specify the layout to use when the list of choices appears

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

}
