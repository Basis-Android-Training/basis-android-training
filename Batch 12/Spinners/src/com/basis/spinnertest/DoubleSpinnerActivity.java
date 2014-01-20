
package com.basis.spinnertest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DoubleSpinnerActivity extends Activity {

    Spinner categoryList, itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_spinner);
        initializeContorls();
        loadData();
        registerEvents();
    }

    private void initializeContorls() {
        categoryList = (Spinner) findViewById(R.id.category);
        itemList = (Spinner) findViewById(R.id.itemList);
    }

    private void loadData() {

        List<String> list = new ArrayList<String>();
        list.add("cat1");
        list.add("cat2");
        list.add("cat3");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        categoryList.setAdapter(adapter);
    }

    private void registerEvents() {

        categoryList.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                Toast.makeText(parent.getContext(),
                        "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_SHORT).show();

                generateItemList(parent.getItemAtPosition(pos).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
    }

    private void generateItemList(String category) {
        List<String> itemsHolder = new ArrayList<String>();

        if (category.equalsIgnoreCase("cat1")) {
            itemsHolder.add("Item1cat1");
            itemsHolder.add("Item2cat1");
            itemsHolder.add("Item3cat1");
            itemsHolder.add("Item4cat1");
        } else if (category.equalsIgnoreCase("cat2")) {

            itemsHolder.add("Item1cat2");
            itemsHolder.add("Item2cat2");
            itemsHolder.add("Item3cat2");
            itemsHolder.add("Item4cat2");

        } else {
            itemsHolder.add("Item1cat3");
            itemsHolder.add("Item2cat3");
            itemsHolder.add("Item3cat3");
            itemsHolder.add("Item4cat3");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsHolder);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        itemList.setAdapter(adapter);
    }

}
