
package com.basis.listviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleList extends Activity {
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
        ArrayAdapter<String> datatHolder = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, prepareData());

        lstSimpleList.setAdapter(datatHolder);

    }

    private void registerEvent() {

        lstSimpleList.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> list, View view, int position, long id) {
                TextView clickedView = (TextView) view;

                // String data = (String) list.getAdapter().getItem(position);

                Toast.makeText(
                        SimpleList.this,
                        "Item with id [" + id + "] - Position [" + position + "] - Planet ["
                                + clickedView.getText() + "]", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private String[] prepareData() {

        return new String[] {
                "Apple", "Avocado", "Banana",
                "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
                "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple"
        };
    }

}
