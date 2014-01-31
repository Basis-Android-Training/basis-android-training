
package com.basis.listviewsample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.basis.listviewsample.adapter.SimpleArrayAdapter;
import com.basis.listviewsample.entiity.Student;

public class CustomAdapterListActivity extends Activity {
    ListView lstSimpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);
        intilizeControls();
        loadData();
        registerEvent();
    }

    private void intilizeControls() {
        lstSimpleList = (ListView) findViewById(R.id.lstSimpleList);
    }

    private void loadData() {
        SimpleArrayAdapter datatHolder = new SimpleArrayAdapter(this,
                R.layout.custome_adapter_list_row_item, prepareData());

        lstSimpleList.setAdapter(datatHolder);
    }

    private void registerEvent() {

        lstSimpleList.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> list, View view, int position, long id) {

            }
        });
    }

    private ArrayList<Student> prepareData() {

        ArrayList<Student> localStudents = new ArrayList<Student>();

        localStudents.add(new Student("Abdullah", 18));
        localStudents.add(new Student("Shuvo", 19));
        localStudents.add(new Student("Salim", 17));

        return localStudents;
    }

}
