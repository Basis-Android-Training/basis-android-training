
package com.basis.gridviewtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class NormalGridView extends Activity {
    GridView grdStudentLists;

    static final String[] students = new String[] {
        "Abul", "Badsha", "Cal", "Daniel", "Ela",
        "Faruk", "Golam", "Henry", "Ishtiaque", "Jara",
        "Kain", "Larry", "Marry", "Nathan", "Osten",
        "Peter", "Qungchi", "Ronaldo", "Silver", "Tsddy",
        "Uzbek", "Verin", "Wqak", "Xack", "Yell", "Zafar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_grid_view);
        initializeContorls();
        registerEvents();
        loadGridView();
    }

    private void initializeContorls() {
        grdStudentLists = (GridView) findViewById(R.id.grdStudentLists);

    }

    private void registerEvents() {
        grdStudentLists.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayAdapter<String> prepareGirdData() {
        return new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, students);

    }

    private void loadGridView() {

        grdStudentLists.setAdapter(prepareGirdData());
    }
}
